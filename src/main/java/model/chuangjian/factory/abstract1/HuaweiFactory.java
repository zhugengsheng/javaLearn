package model.chuangjian.factory.abstract1;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 11:10 下午
 */
public class HuaweiFactory implements Factory {

    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Luyouqi createLuyouqi() {
        return new HuaweiLuyouqi();
    }
}
