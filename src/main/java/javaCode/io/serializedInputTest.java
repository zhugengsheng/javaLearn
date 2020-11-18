package javaCode.io;

import java.io.*;

public class serializedInputTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/person.text"));
        Person o = (Person) inputStream.readObject();
        System.out.println(o.getAge());
        System.out.println(o.getName());
        inputStream.close();
    }
}
