package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/16 3:25 下午
 */
public class ThreadPoolExecutorDemo {
    private static final int COL_SIZE = 5;
    private static final int MAX_SIZE = 10;
    private static final int QUEUE_CAPACITY  = 50;
    private static final Long KEEP_ALIVE_TIME = 10L;

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(COL_SIZE, MAX_SIZE, KEEP_ALIVE_TIME,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 100; i++) {
            MyRunnable myRunnable = new MyRunnable("" + i);
            threadPoolExecutor.execute(myRunnable);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()){

        }
        System.out.println("Finished all threads");
    }
}
