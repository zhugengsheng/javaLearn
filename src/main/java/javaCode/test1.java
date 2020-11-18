package javaCode;

import java.util.List;
import java.util.Objects;

public class test1{
    public static void main(String[] args) {
//        List<Integer> list = List.of(1,2,3);
//        list.add(4);

        String a = null;
        if (Objects.nonNull(a)){
            System.out.println("here");
        }else{
            System.out.println("null");
        }

    }
}
