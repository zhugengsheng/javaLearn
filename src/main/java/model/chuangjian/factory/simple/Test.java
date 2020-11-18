package model.chuangjian.factory.simple;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 10:50 下午
 */
public class Test {
    public static void main(String[] args) {
        Car telsa = CarFactory.getCar("Telsa");
        telsa.name();
    }
}
