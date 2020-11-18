package model.chuangjian.singleton;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/17 9:06 下午
 * 懒汉式+双重校验锁
 */
public class Singleton2 {
    private volatile static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if (singleton2 == null){
            synchronized (Singleton2.class){
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }

        }
        return singleton2;
    }
}
