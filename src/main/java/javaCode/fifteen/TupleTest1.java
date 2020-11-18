package javaCode.fifteen;

import java.util.*;

public class TupleTest1 {

    public static void main(String[] args) {
        TwoTuple hi = Tuple.twoTuple("hi", 47);
        printword(hi);
    }
    public static void printword(TwoTuple twoTuple){
        System.out.println(twoTuple);
    }
}

