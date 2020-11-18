package javaCode.two;

public class intTest {
    public static void main(String[] args) {
        Integer a=4;
        Integer b = a;
        b= b+1;

        String aa ="aaa";
        System.out.println(aa.hashCode());
        String bb=aa;
        System.out.println(bb.hashCode());
        bb = bb+1;
        System.out.println(bb.hashCode());
        System.out.println(a);
        System.out.println(b);

        System.out.println(aa);
        System.out.println(bb);
    }
}
