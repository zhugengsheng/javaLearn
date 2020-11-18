package base;

import org.w3c.dom.ls.LSOutput;

public class trywithresource {


    public static void main(String[] args) {
//        try(MyResource resource = new MyResource()) {
//            int i = 11/0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Integer x =10;
        test(x);
        x =20;
        test(x);
    }

    public static void test(int x){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok" + x);
            }
        };
        runnable.run();
    }


    static class MyResource implements AutoCloseable{
        @Override
        public void close() throws Exception {
            throw new Exception("close 异常");
        }

    }
}
