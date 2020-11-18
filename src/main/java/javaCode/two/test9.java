package javaCode.two;

public class test9 {
    public static void main(String[] args) {
        int i = 0;
        while (i<20){
            i++;
            if (i==10){
                System.out.println("come");
                return;
            }
            System.out.println("i:"+i);
        }
    }
}
