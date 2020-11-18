package jvm;

import java.util.ServiceLoader;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/9/28 8:22 上午
 */
public class whiletrue {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            System.out.println(123);
        }
    }
}
