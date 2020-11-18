package base;

import java.sql.Date;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/16 1:03 下午
 */
public class test7 {
    private volatile static test7 test;
    private test7 name;
    public test7() {
    }

    public test7 getUnique(){
        if (test == null){
            synchronized (test7.class){
                if (test==null){
                    test = new test7();
                }

            }
        }
//        test7.test(.test)//无法调用字段下的test
        test7 tst = name.name.name.name.name.name;

        return test;
    }

    public static void main(String[] args) {
        Long time=null;
        System.out.println(new Date(0));
//        int i = 0;
//        while (true){
//            System.out.println(i);
//            if (i ==5){
//                break;
//            }
//            i++;
//        }
    }
}
