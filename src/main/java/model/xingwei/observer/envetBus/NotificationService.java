package model.xingwei.observer.envetBus;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/4 8:36 上午
 */
public class NotificationService {
    public void sendInboxMessage(Long userId){
        System.out.println("发放邮件给：" + userId);
    }
}
