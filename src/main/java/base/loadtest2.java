package base;

public class loadtest2 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(loadtest2.class.getClassLoader());
        Class<?> aClass = loadtest2.class.getClassLoader().loadClass("base.H");
        System.out.println(aClass.getClassLoader());
    }
}
class H{}
