package model.xingwei.observer.envetBus;

import com.google.common.collect.ImmutableList;
import model.jiegou.proxy.invocation.UserService;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/4 8:38 上午
 */
public class UserController {
    private UserService userService;

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController(){
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers){
        for (Object observer :
                observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password){
        eventBus.post(1L);
        return 1L;
    }

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.setRegObservers(ImmutableList.of(new RegNotificationObserver(new NotificationService())));
        userController.setRegObservers(ImmutableList.of(new RegPromotionObserver(new PromotionService())));
        userController.register("1232","sdfea");
    }
}
