package javaCode.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\a.text");
        fos.write(96);
        fos.close();
    }
}
