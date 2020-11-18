package javaCode.thread;


public class SnExample implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
