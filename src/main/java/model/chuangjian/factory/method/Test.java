package model.chuangjian.factory.method;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 11:00 下午
 */
public class Test {
    public static void main(String[] args) {
        Car car = new TelsaFactory().getCar();
        car.name();
    }
}
