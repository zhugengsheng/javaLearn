package javaCode.two;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        for (char c = 0; c <128; c++){
            System.out.println("value:" + (int)c + " character:" + c);
            if (Character.isLowerCase(c)){
                System.out.println("value:" + (int)c + " character:" + c);
            }
        }

//        int b = Integer.MAX_VALUE;
//        int big = b *4;
//        System.out.println(big);

//        boolean b = false&&false;
//        System.out.println(b);
//        System.out.println(false && false);

//        Random random = new Random(47);
//        float a = random.nextFloat();
//        float b = random.nextFloat();
//
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println(a-b);

//        RandomTest rt = new RandomTest();
//        rt.testRandom();
    }

    public void testRandom(){
        System.out.println("Random不设置种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Random设置种子：");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            random.setSeed(90);
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + random.nextInt(100) + ", ");
            }
            System.out.println("");
        }
    }
}