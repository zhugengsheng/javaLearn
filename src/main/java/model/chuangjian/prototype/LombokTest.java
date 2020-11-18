package model.chuangjian.prototype;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 2:37 下午
 */
public class LombokTest {
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla();
        tesla1.setPinpai("tesla");
        tesla1.setName("aaa");
        Tesla tesla2 = new Tesla();
        tesla2.setPinpai("tesla");
        tesla2.setName("bbb");
        System.out.println(tesla1.hashCode());
        System.out.println(tesla2.hashCode());
    }
}
