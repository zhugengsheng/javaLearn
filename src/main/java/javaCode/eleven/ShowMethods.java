package javaCode.eleven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage = "usage: ShowMethods qualified";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        args= new String[]{"javaCode.eleven.ShowMethods"};
//        if (args.length<1){
//            System.out.println(usage);
//            System.exit(0);
//        }
        int lines =0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length ==1 ){
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(" "));
                }
                for (Constructor constructor : ctors) {
                    System.out.println(p.matcher(constructor.toString()).replaceAll(" "));
                }
                lines = methods.length + ctors.length;
            }else{
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1){
                        System.out.println(p.matcher(method.toString()).replaceAll(" "));
                        lines++;
                    }
                    for (Constructor constructor : ctors) {
                        if (constructor.toString().indexOf(args[1])!=-1){
                            System.out.println(p.matcher(constructor.toString()).replaceAll(" "));
                            lines++;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
