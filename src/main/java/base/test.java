package base;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class test {
    public static void main(String[] args) {
        new Thread(null,()->{
            System.out.println("1...");
            while (true){

            }
        },"thread1").start();

        new Thread(null,()->{
            System.out.println("1...");
            try{
                Thread.sleep(100000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        },"thread2").start();
    }

}
