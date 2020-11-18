package model.chuangjian.factory.method;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 10:59 下午
 */
public class WulingFactory implements Factory {
    @Override
    public Car getCar() {
        return new Wuling();
    }
}
