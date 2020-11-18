package model.chuangjian.factory.abstract1;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 11:11 下午
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new HuaweiFactory().createPhone();
        phone.sendMsg();
    }
}
