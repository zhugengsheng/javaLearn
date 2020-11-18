package model.jiegou.pripline.openclosed;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:31 上午
 */
public class ApplicationContext {
    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans(){
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule,notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule,notification));
    }

    public Alert getAlert(){
        return alert;
    }

    private static final ApplicationContext instance = new ApplicationContext();
    private ApplicationContext(){
        initializeBeans();
    }

    public static ApplicationContext getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        apiStatInfo.setErrorCount(10000);
        apiStatInfo.setDurationOfSeconds(1000);
        apiStatInfo.setRequestCount(10000000);
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
