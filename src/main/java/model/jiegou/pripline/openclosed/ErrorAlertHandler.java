package model.jiegou.pripline.openclosed;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:28 上午
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > 1000){
            notification.notify(NotificationEmergencyLevel.SEVERE,"报警");
        }
    }
}
