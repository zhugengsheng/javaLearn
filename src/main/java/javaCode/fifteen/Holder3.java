package javaCode.fifteen;

public class Holder3<T> {
    private T a;
    public final String b = "null";
    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<String> holder3 = new Holder3<>("aaa");
//        holder3.b ="aa";
        String a = holder3.get();
        System.out.println(a);
    }
}
