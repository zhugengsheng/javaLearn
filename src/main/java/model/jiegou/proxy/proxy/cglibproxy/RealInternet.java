package model.jiegou.proxy.proxy.cglibproxy;

public class RealInternet {

    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to "+ serverHost);
    }

    @Override
    public String toString() {
        return "RealInternet{}";
    }
}
