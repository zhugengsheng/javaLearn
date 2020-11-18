package javaCode.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("src/d.text"), StandardCharsets.UTF_8);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("src/dd.text"), "GBK");
        outputStreamWriter.write("你好");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }


}
