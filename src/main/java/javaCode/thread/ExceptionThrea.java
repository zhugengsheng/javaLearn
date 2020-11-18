package javaCode.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThrea implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
//        Thread t = new Thread(new ExceptionThrea());
//        t.start();
        ExecutorService exec = Executors.newCachedThreadPool();
        try{
            exec.execute(new ExceptionThrea());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
