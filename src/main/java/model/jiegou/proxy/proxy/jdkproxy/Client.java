package model.jiegou.proxy.proxy.jdkproxy;


public class Client {

    public static void main(String[] args) {
        Internet internet = (Internet) new ProxyFactory(new RealInternet()).getProxyInstance();
        try {
            internet.connectTo("360.cn");
            internet.connectTo("qq.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}