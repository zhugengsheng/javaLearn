package javaCode.thread;

public class LiftOff implements Runnable {
    protected int countDown = 10;
    public static int taskCount = 0;
    private final int id = taskCount ++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown >0 ? countDown : "listoff!") + ")";
    }

    @Override
    public void run() {
        while (countDown-- >0){
            System.out.print(status());
        }
        Thread.yield();
    }
}
