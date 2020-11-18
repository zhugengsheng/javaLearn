package javaCode.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamWriterTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("src/d.text"));
        int len = 0;
        while ((len=inputStreamReader.read())!=-1){
            System.out.print((char) len);
        }
        inputStreamReader.close();
    }
}
