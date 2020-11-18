package model.chuangjian.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/24 6:32 下午
 */
public enum EnumSingleton {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}

