package model.chuangjian.factory.abstract1;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 11:08 下午
 */
public class xiaomiPhone implements Phone {

    @Override
    public void sendMsg() {
        System.out.println("小米手机发消息");
    }
}
