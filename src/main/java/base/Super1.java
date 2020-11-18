package base;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 8:13 上午
 */
public class Super1 {
        protected int number;

        protected void showNumber() {
            System.out.println("number = " + number);
        }
    }

class Sub extends Super1 {
    void bar() {
        super.number = 10;
        super.showNumber();
    }
}

