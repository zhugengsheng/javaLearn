package model.xingwei.observer.envetBus;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/4 8:34 上午
 */
public class RegNotificationObserver {

    private NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId);
    }
}
