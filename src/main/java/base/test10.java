package base;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/11 10:12 下午
 */
public class test10 {
        static{
            int x=5;
        }
        static int x,y;
        public static void main(String args[]){
            x--;
            myMethod( );
            System.out.println(x+y+ ++x);
        }
        public static void myMethod( ){
            y=x++ + ++x;
        }


}
