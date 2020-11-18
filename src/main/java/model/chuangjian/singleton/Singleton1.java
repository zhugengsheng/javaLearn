package model.chuangjian.singleton;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/17 9:04 下午
 * 饿汉式
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    private static Singleton1 getInstance(){
        return singleton1;
    }
}
