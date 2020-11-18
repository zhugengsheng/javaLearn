package model.jiegou.adapter;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 4:47 下午
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter1 adapter1 = new Adapter1(adaptee);
        computer.net(adapter1);

    }
}
