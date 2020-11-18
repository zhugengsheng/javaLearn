package model.jiegou.proxy.jike;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/28 7:58 上午
 */
public class UserController implements IUserController{

    private MetricsCollector metricsCollector;

    @Override
    public void login(String telephone, String password) {
        System.out.println("登陆成功");
    }

    @Override
    public void register(String telephone, String password) {
        System.out.println("注册成功");
    }
}
