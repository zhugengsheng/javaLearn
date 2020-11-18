package javaCode.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class test4 {
    public static void main(String[] args) throws IOException {
        long current=System.currentTimeMillis();
        FileReader fis = new FileReader("src\\a.text");
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.print((char) len);
        }
        fis.close();
        long newcurrent=System.currentTimeMillis();
        System.out.println("时间"+(newcurrent-current)+"毫秒");
    }
}
