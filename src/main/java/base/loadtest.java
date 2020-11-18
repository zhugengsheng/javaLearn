package base;

public class loadtest {
    static {
        System.out.println("main init");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1.静态常量不会初始化
//        System.out.println(base.B.b);
//        //2。类对象.class不会初始化
//        System.out.println(base.B.class);
//        //3。创建该类的数组不会触发初始化
//        System.out.println(new base.B[0]);
//        //4。不会初始化类b，但会加载B，base.A
        ClassLoader c1 = Thread.currentThread().getContextClassLoader();
        c1.loadClass("base.B");
//        //5。不会初始化类B，但湖加载B，base.A
//        ClassLoader c2 = Thread.currentThread().getContextClassLoader();
//        Class.forName("base.B",false,c2);

        //会初始化
          //1。首次访问这个类的静态变量或静态方法
//        System.out.println(base.A.a);
//        //2。子类初始化，如果父类还没初始化，会引发
//        System.out.println(base.B.c);
//        //3。子类访问父类静态变量，只触发父类初始化!!!!!!
//        System.out.println(base.B.a);
        //4。会初始化类B，并 先!!初始化类A
//        Class.forName("base.B");
    }
}
class A{
    static int a =0;
    static {
        System.out.println("base.A init");
    }
}
class B extends A{
    final static double b = 5.0;
    static boolean c =false;
    static {
        System.out.println("b init");
    }
}