package model.jiegou.proxy.proxy.cglibproxy;


public class Client {

    public static void main(String[] args) throws Exception {
        //目标对象
        RealInternet target = new RealInternet();
        //获取代理对象,并且将目标对象传递给代理对象
        RealInternet internet = (RealInternet) new ProxyFactory(target).getProxyInstance();
        internet.connectTo("so.cn");
    }
}