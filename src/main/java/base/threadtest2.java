package base;

public class threadtest2 {
     volatile static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (run){
                //
            }
        });
        t1.start();

        Thread.sleep(1000);
        run = false;
    }
}
