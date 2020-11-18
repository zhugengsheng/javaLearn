package javaCode.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        long current=System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("/Users/zhugenghseng/Desktop/a.jpeg");
        FileOutputStream fos = new FileOutputStream("/Users/zhugenghseng/Desktop/b.jpeg");

        int len = 0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
        long newcurrent=System.currentTimeMillis();
        System.out.println("复制时间"+(newcurrent-current)+"毫秒");
    }
}
