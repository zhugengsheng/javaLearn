package base;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        int i = 0;
        try {
            for (int j =0 ;j<1000000;j++){
                String.valueOf(j).intern();
                i++;
            }
//            List<String> list =new ArrayList<>();
//            String a = "hello";
//            while (true){
//                list.add(a);
//                a= a+a;
//                i++;
//            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
