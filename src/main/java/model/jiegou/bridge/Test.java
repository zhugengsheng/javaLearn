package model.jiegou.bridge;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 5:42 下午
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Desktop(new Lenovo());
        computer.info();

        Laptop laptop = new Laptop(new Apple());
        laptop.info();
    }
}
