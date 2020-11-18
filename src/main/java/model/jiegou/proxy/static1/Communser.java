package model.jiegou.proxy.static1;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 9:35 下午
 */
public class Communser {
    public static void main(String[] args) {
        House house = new House();
        Proxy proxy = new Proxy(house);
        proxy.rent();
    }
}
