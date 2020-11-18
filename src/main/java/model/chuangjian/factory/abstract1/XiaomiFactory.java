package model.chuangjian.factory.abstract1;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 11:10 下午
 */
public class XiaomiFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new xiaomiPhone();
    }

    @Override
    public Luyouqi createLuyouqi() {
        return new XiaomiLuyouqi();
    }
}
