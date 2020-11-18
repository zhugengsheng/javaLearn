package model.jiegou.proxy.rpc.server;


import model.jiegou.proxy.rpc.RpcServer;

/**
 * @author zhugenghseng
 */
public class RpcServerApplication {

    public static void main(String[] args) throws Exception {
      CalculatorService service = new CalculatorServiceImpl();
      RpcServer server = new RpcServer();
      server.export(service, 1234);
    }

}
