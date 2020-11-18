package base;

import java.util.concurrent.BrokenBarrierException;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/9/21 10:36 上午
 */
public class test9 {
    private static int num = 0;

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        for (int i = 0; i < 100; i++) {
            final int threadNum = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (threadNum > num) {
                        System.out.println(Thread.currentThread().getName() + ":" + threadNum);
                        num = threadNum;
                    }
                }
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(num);
    }
}
