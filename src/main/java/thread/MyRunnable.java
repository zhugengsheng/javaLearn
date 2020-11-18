package thread;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.Date;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/16 3:22 下午
 */
public class MyRunnable implements Runnable {

    private String command;

    public MyRunnable(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return this.command;
    }


    @SneakyThrows
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  start time:" + command);
//        process();
//        System.out.println(Thread.currentThread().getName()+"  end time:" + command);
    }

    private void process() throws InterruptedException {
        Thread.sleep(500);
    }
}
