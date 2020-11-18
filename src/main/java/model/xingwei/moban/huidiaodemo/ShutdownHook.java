package model.xingwei.moban.huidiaodemo;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/6 8:27 上午
 */
public class ShutdownHook {
    private static class shutdown extends Thread{
        @Override
        public void run(){
            System.out.println("I am calling ");
        }
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new shutdown());
    }
}
