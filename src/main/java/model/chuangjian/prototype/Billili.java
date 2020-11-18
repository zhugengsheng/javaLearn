package model.chuangjian.prototype;

import java.util.Date;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 2:02 下午
 */
public class Billili {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("说java",date,1);
        System.out.println("V1" + v1);
        System.out.println(v1.hashCode());
        System.out.println("===============");
        Video v2 = (Video) v1.clone();
        System.out.println("V2" + v2);
        System.out.println(v2.hashCode());
        System.out.println("===============");
        v2.setName("zhu说");
        v2.setI(2);
        date.setTime(1121201021);

        System.out.println(v1);
        System.out.println(v2);

    }
}
