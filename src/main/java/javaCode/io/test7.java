package javaCode.io;

public class test7 {
    private static int n = 0;
    public static void bar(){
        test7 m1 = new test7();
        test7 m2 = new test7();
        test7 m3 = new test7();
        m1.setN(5);
        m3.foo();
    }
    public void setN(int newValue){
        n = newValue;
    }
    public test7(){
        n = n+1;
    }
    public void foo(){
        System.out.println(n);
    }

    public static void main(String[] args) {
        test7.bar();
    }
}
