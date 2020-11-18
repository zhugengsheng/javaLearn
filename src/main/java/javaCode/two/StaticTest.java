package javaCode.two;

public class StaticTest {
    private static int i =1;

    public static void main(String[] args) {
        System.out.println(++StaticTest.i);
        System.out.println(StaticTest.i);
    }
}
