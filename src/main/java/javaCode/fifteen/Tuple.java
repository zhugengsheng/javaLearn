package javaCode.fifteen;

public class Tuple {
    public static <A,B> TwoTuple<A,B> twoTuple(A a,B b){
        return new TwoTuple<A,B>(a,b);
    }
}
