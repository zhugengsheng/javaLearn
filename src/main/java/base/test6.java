package base;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/13 7:36 上午
 */
public class test6 extends test5 {
    @Override
    public void print() {
        System.out.println(111);
    }

    public static void main(String[] args) {
        test5 test = new test6();
        test.print();
    }
}
