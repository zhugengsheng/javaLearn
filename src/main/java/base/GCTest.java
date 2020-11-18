package base;

import java.util.ArrayList;

public class GCTest {

    private static final int _8M = 8 * 1024 * 1024;
    public static void main(String[] args) throws InterruptedException {
//        ArrayList<byte[]> arry = new ArrayList<>();
//            arry.add(new byte[_8M]);
//            arry.add(new byte[_8M]);
        new Thread(() -> {
            ArrayList<byte[]> arry = new ArrayList<>();
            arry.add(new byte[_8M]);
            arry.add(new byte[_8M]);
        }).start();
        System.out.println("sleep:");
        Thread.sleep(100L);
    }
}
