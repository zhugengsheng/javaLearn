package javaCode.thread;


import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static net.mindview.util.Print.printf;

abstract class Accumulator{
    public static long cycles = 5000L;
    private static final int N = 4;
    public static ExecutorService exec = Executors.newFixedThreadPool(N * 2);
    private static CyclicBarrier barrier = new CyclicBarrier(N * 2);
    protected volatile int index = 0;
    protected volatile int value = 0;
    protected long  duration = 0;
    protected String id = "error";
    protected final static int SIZE = 100000;
    protected static int[] preLoaded = new int[SIZE];

    static {
        Random rand = new Random(47);

        for (int i = 0; i < SIZE; i++) {
            preLoaded[i] = rand.nextInt();
        }
    }

    public abstract void accumulate();
    public abstract long read();
    private class Modifier implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < cycles; i++) {
                accumulate();
            }
            try {
                barrier.await();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    private class Reader implements Runnable{
        private volatile long value;
        @Override
        public void run() {
            for (int i = 0; i < cycles; i++) {
                value = read();
            }
            try {
                barrier.await();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
    public void  timedText(){
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            exec.execute(new Modifier());
            exec.execute(new Reader());
        }
        try {
            barrier.await();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        duration  = System.nanoTime()-start;
        printf("%-13s: %13d\n", id, duration);
    }

    public static void report(Accumulator acca1, Accumulator acca2){
        printf("%-22s: %.2f\n",acca1.id + "/" + acca2.id,(double)acca1.duration/(double)acca2.duration);
    }
}

class BaseLine extends Accumulator{
    {
        id = "baseLine";
    }
    @Override
    public void accumulate() {
        value += preLoaded[index++];
        if (index >=SIZE) {
            index = 0;
        }
    }

    @Override
    public long read() {
        return value;
    }
}

class SynchronizedTest extends Accumulator{
    {
        id = "SynchronizedTest";
    }
    @Override
    public synchronized void accumulate() {
        value += preLoaded[index++];
        if (index >=SIZE) {
            index = 0;
        }
    }

    @Override
    public long read() {
        return value;
    }
}

class LockTest extends Accumulator{
    {
        id = "LockTest";
    }

    private Lock lock = new ReentrantLock();
    @Override
    public void accumulate() {
        lock.lock();
        try {
            value += preLoaded[index++];
            if (index >=SIZE) {
                index = 0;
            }
        }finally {
            lock.unlock();
        }
    }

    @Override
    public long read() {
        lock.lock();
        try {
            return value;
        }finally {
            lock.unlock();
        }
    }
}

class AtomicTest extends Accumulator{
    {
        id = "AtomicTest";
    }
    private AtomicInteger index = new AtomicInteger(0);
    private AtomicLong value = new AtomicLong(0);
    @Override
    public void accumulate() {
        int i  = index.getAndIncrement();
        value.getAndAdd(preLoaded[i]);
        if (++i >= SIZE){
            index.set(0);
        }
    }

    @Override
    public long read() {
        return value.get();
    }
}

public class SynchronizationComparisons {
    static BaseLine baseLine = new BaseLine();
    static SynchronizedTest synch = new SynchronizedTest();
    static LockTest lock = new LockTest();
    static AtomicTest atomic = new AtomicTest();
    static void test(){
        System.out.println("=================");
        printf("%-12s:%13d\n","cycles",Accumulator.cycles);
        baseLine.timedText();
        synch.timedText();
        lock.timedText();
        atomic.timedText();
        Accumulator.report(synch, baseLine);
        Accumulator.report(lock, baseLine);
        Accumulator.report(atomic, baseLine);
        Accumulator.report(synch, lock);
        Accumulator.report(synch, atomic);
        Accumulator.report(lock, atomic);

    }

    public static void main(String[] args) throws InterruptedException {
        int iterations = 5;
        if (args.length > 0 ){
            iterations = new Integer(args[0]);
        }
        System.out.println("warmup");
       baseLine.timedText();
        for (int i = 0; i < iterations; i++) {
            test();
            Accumulator.cycles *=2;

        }
        System.out.println("finish");
        Accumulator.exec.shutdown();
    }
}

