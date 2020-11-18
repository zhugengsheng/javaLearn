package base;

public class iadd {
    public static void main(String[] args) {
//        int i =0;
//        int x =0 ;
//        while (i<10){
//            x = x++;
//            i++;
//        }
//        System.out.println(x);


//        int i =200000000;
        //i拿的还是原来的引用
        String a = "111";
        add(a);
        System.out.println(a.hashCode());
    }

//    public static void add(int i){
//        i = i+1;
//        //i被修改了引用
//        System.out.println(i);
//    }

    public static void add(String a){
        System.out.println(a.hashCode());
         a = a + "111";
        //i被修改了引用
        System.out.println(a.hashCode());
    }
}
