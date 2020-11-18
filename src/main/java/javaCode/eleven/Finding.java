package javaCode.eleven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\d{3,5}").matcher("13-45-67897");
        System.out.println(m.lookingAt());
//        System.out.println(m.matches());
//        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linenet's wings");
        while (m.find())
            System.out.println(m.group()+" ");
        System.out.println(" ");
//        int i =0;
//        while (m.find(i)) {
//            System.out.println(m.group() + " ");
//            i++;
//        }

    }
}
