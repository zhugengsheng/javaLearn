package model.jiegou.adapter;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 4:46 下午
 */
public class Adapter1 implements NetToSub {
    private Adaptee adaptee;

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
