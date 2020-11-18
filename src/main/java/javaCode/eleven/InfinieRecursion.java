package javaCode.eleven;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class InfinieRecursion {
    public String toString(){
        return "InfiniteRecursion address:"+super.toString()+"\n";

    }

    public static void main(String[] args) {
//        List<InfinieRecursion> list = new ArrayList<>();
//        for (int i = 0; i <10; i++) {
//            list.add(new InfinieRecursion());
//
//        }
//        System.out.println(list);

        PrintStream printStream = System.out;
        Formatter formatter = new Formatter(printStream);
        formatter.format("aabbcc");
        System.out.println("ccddbb");

        int i = 0;
        formatter.format("%b\n",i);
    }
}
