package javaCode.thread;

import java.util.concurrent.*;

public class CyclicBarrierTest {
    public static class Worker implements Runnable{
        private CyclicBarrier cyclicBarrier ;

        public Worker(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                System.out.println("开始：" + Thread.currentThread().getName());
                cyclicBarrier.await();
                Thread.sleep(1000L);
                System.out.println("执行完毕：" + Thread.currentThread().getName());
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(6);
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            exec.execute(new Worker(cyclicBarrier));
        }
        exec.shutdown();
    }

}
