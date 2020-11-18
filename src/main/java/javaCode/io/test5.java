package javaCode.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test5 {
    public static void main(String[] args) throws IOException {
        long current=System.currentTimeMillis();
        FileWriter fis = new FileWriter("src/b.text");
        fis.write(98);
        fis.flush();
        long newcurrent=System.currentTimeMillis();
        System.out.println("时间"+(newcurrent-current)+"毫秒");
    }
}
