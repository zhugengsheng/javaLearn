package model.jiegou.pripline.openclosed;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:23 上午
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
