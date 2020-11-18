package javaCode.io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("src\\a.text");
//        byte[] bytes = new byte[2];
//        int read = fos.read(bytes);
//        System.out.println(read);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fos.read(bytes))!=-1){
            System.out.println(new String(bytes,0 ,len));
        }
        fos.close();
    }
}
