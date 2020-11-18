package model.jiegou.pripline.openclosed;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:28 上午
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > 1000){
            notification.notify(NotificationEmergencyLevel.URGENCY,"报警");
        }
    }
}
