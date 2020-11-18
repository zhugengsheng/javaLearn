package base;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class atomicInteger {
    private static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException, IOException {
        Thread t1 = new Thread(()->{
            for (int j=0;j<5000;j++){
                i.getAndIncrement(); //i++
//                i.incrementAndGet()   //++i
            }
        });

        Thread t2 = new Thread(()->{
            for (int j=0;j<5000;j++){
                i.getAndDecrement();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
