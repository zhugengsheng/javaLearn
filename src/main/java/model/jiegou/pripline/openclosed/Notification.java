package model.jiegou.pripline.openclosed;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:20 上午
 */
public class Notification {
    public void notify(NotificationEmergencyLevel level, String message){
        System.out.println("send "+ message);
    }
}
