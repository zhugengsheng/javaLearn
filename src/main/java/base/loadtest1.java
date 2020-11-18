package base;

public class loadtest1 {
    //单例懒加载

    public static void main(String[] args) {
        //不会加载局部内部类 LazyHolder的加载、链接、初始化
//        base.Singleton.base.test();

        Singleton.getInstance();
    }
}

class Singleton{
    public static void test(){
        System.out.println("base.test");
    }


    private  Singleton(){};
//静态内部类可以访问外部了的资源，方法
    private static class LazyHolder{
        private static final Singleton singleton = new Singleton();
        static {
            System.out.println("lazy holder init");
        }
    }

    public static Singleton getInstance(){
        return LazyHolder.singleton;
    }
}
