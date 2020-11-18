package base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ThreadClassLoad {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        System.out.println(DriverManager.class.getClassLoader());
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> c1 = myClassLoader.loadClass("base.mapimpl1");
        Class<?> c2 = myClassLoader.loadClass("base.mapimpl1");
        System.out.println(c1 == c2);
        MyClassLoader myClassLoader1 = new MyClassLoader();
        System.out.println(myClassLoader1 == myClassLoader);
        Class<?> c3 = myClassLoader1.loadClass("base.mapimpl1");
        System.out.println(c1 == c3);
//        c1.newInstance();
    }


}
//自定义类加载器
class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String path = "/Users/zhugenghseng/Desktop/workproject/javaLearn/target/classes/"+name +".class";
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Files.copy(Paths.get(path), os);

            byte[] bytes = os.toByteArray();
            return defineClass(name,bytes,0,bytes.length);
        }catch (IOException e){
            e.printStackTrace();
            throw new ClassNotFoundException("类文件没找到",e);
        }

    }
}