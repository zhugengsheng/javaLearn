package javaCode.thread;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {

}

class DelayedTask implements Runnable, Delayed{

    @Override
    public int compareTo(Delayed delayed) {
        return 0;
    }

    @Override
    public void run() {

    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return 0;
    }
}