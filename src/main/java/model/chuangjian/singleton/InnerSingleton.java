package model.chuangjian.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/24 6:41 下午
 */
public class InnerSingleton {
    private AtomicInteger id = new AtomicInteger(0);

    private InnerSingleton(){

    }

    private static class SingletonHolder{
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public int getId(){
        return id.getAndIncrement();
    }
}
