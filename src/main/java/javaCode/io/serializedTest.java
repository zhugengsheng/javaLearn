package javaCode.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class serializedTest {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStreamWriter = new ObjectOutputStream(new FileOutputStream("src/person.text"));
        outputStreamWriter.writeObject(new Person("小白",13));
        outputStreamWriter.close();
    }
}
