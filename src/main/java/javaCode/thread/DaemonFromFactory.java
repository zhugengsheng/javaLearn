package javaCode.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {

    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec  = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
//            exec.execute(new DaemonFromFactory());
            Thread t = new Thread(new DaemonFromFactory());
            t.setDaemon(true);
            t.start();
        }
        System.out.println("All Daemon started");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("end");
    }
}
