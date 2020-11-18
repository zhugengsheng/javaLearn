package model.xingwei.observer.envetBus;

import java.util.concurrent.Executor;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/4 8:31 上午
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor){
        super(executor);
    }
}
