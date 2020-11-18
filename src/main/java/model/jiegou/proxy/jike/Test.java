package model.jiegou.proxy.jike;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/28 8:05 上午
 */
public class Test {
    public static void main(String[] args) {
//        MetricsCollector metricsCollector = new MetricsCollector(new RedisMetricsStorage());
//        UserControllerProxy userControllerProxy = new UserControllerProxy(metricsCollector);
//        userControllerProxy.login("1111","2313123");

        MetricsCollector metricsCollector = new MetricsCollector(new RedisMetricsStorage());
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy(metricsCollector);
        IUserController proxy = (IUserController) metricsCollectorProxy.createProxy(new UserController());
        proxy.login("112","3123");

    }
}
