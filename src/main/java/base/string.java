package base;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;

public class string {
    public static String contract(String x, String y){
        return new StringBuilder().append(x).append(y).toString();
    }

    public static void main(String[] args) throws Throwable {
        List<String> a = new ArrayList<>();
        String x = "a";
        String y = "b";
        for (int i =0; i<2000000;i++){
            String z = x + i;
            a.add(z);
        }
        System.out.println(a);
        MethodHandle mh = MethodHandles.lookup().findStatic(string.class,"contract", MethodType.methodType(String.class,String.class,String.class));
        String invoke = (String) mh.invoke(x, y);
        System.out.println(invoke);
    }


}
