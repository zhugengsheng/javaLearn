package model.chuangjian.singleton;

import thread.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/24 6:33 下午
 */
public class test {
    public static void main(String[] args) {
//        EnumSingleton instance = EnumSingleton.INSTANCE;
        InnerSingleton instance = InnerSingleton.getInstance();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(20, 100, 100,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(10),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 100; i++) {
            MyRunnable myRunnable = new MyRunnable("" +  instance.getId());
            threadPoolExecutor.execute(myRunnable);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()){

        }
        System.out.println(instance.getId());
        System.out.println("Finished all threads");

    }
}
