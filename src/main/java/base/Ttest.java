package base;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class Ttest {
    public Set<Integer> test(List<String> list,Map<Integer,Object> mapa){
        Set<Integer> set = new HashSet<Integer>();
        return set;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method test = Ttest.class.getMethod("test",List.class,Map.class);
        Type[] types = test.getGenericParameterTypes();
        for (Type type:types) {
            if (type instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) type;
                System.out.println(parameterizedType.getRawType());
                Type[] arguments = parameterizedType.getActualTypeArguments();
                for (int i = 0;i< arguments.length;i++
                     ) {
                    System.out.println(arguments[i]);
                }
            }
        }
//获取返回参数类型
        Type resType = test.getGenericReturnType();
        System.out.println(resType);
        if (resType instanceof ParameterizedType){
            ParameterizedType returnType = (ParameterizedType) resType;
            System.out.println(returnType.getRawType());
            System.out.println(returnType.getActualTypeArguments()[0]);
        }

        System.out.println(resType.getTypeName());
    }

}
