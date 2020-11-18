package javaCode.fifteen;

public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("hi",47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> f = f();
        System.out.println(f);
        System.out.println(f.first);
    }
}
