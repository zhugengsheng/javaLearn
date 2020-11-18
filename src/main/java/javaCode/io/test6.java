package javaCode.io;

import java.io.FileWriter;
import java.io.IOException;

public class test6 {
    public static void main(String[] args) throws IOException {
        long current=System.currentTimeMillis();
        FileWriter fis = new FileWriter("src/c.text",true);
        for (int i = 0; i < 10; i++) {
            fis.write("天天开心"+"\r\n");
            fis.flush();
        }
       fis.close();
        long newcurrent=System.currentTimeMillis();
        System.out.println("时间"+(newcurrent-current)+"毫秒");
    }
}
