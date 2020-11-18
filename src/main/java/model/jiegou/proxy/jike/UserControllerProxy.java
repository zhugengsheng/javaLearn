package model.jiegou.proxy.jike;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/28 8:02 上午
 */
public class UserControllerProxy extends UserController{
    private MetricsCollector metricsCollector;

    public UserControllerProxy(MetricsCollector metricsCollector) {
        this.metricsCollector = metricsCollector;
    }

    @Override
    public void login(String telephone, String password){
        long startTime = System.currentTimeMillis();
        super.login(telephone,password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime-startTime;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);
    }

    @Override
    public void register(String telephone, String password){
        long startTime = System.currentTimeMillis();
        super.register(telephone,password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime-startTime;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTime);
        metricsCollector.recordRequest(requestInfo);
    }
}
