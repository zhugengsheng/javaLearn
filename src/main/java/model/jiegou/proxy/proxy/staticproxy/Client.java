package model.jiegou.proxy.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet(new RealInternet());
        try {
            internet.connectTo("so.com");
            internet.connectTo("qq.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}