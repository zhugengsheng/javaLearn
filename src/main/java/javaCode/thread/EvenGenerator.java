package javaCode.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
//    @Override
//    public synchronized int next() {
//        ++currentEvenValue;  //Danger!!!!!
//        ++currentEvenValue;
//        return currentEvenValue;
//    }

    private Lock lock = new ReentrantLock();
        @Override
    public synchronized int next() {
            lock.lock();
            try {
                ++currentEvenValue;  //Danger!!!!!
                ++currentEvenValue;
                return currentEvenValue;
            }finally {
                lock.unlock();
            }
    }
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
