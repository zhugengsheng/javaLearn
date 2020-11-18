package model.jiegou.proxy.invocation;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 10:46 下午
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyIncovalHandler proxyIncovalHandler = new ProxyIncovalHandler();
        proxyIncovalHandler.setTarget(userService);
        UserService proxy = (UserService) proxyIncovalHandler.getProxy();
        proxy.add();

    }
}
