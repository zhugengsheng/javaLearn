package model.jiegou.proxy.invocation;


/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 9:35 下午
 */
public class Communser {
    public static void main(String[] args) {
        House house = new House();
        ProxyIncovalHandler pih = new ProxyIncovalHandler();
        pih.setTarget(house);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
