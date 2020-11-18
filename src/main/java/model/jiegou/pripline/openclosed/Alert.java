package model.jiegou.pripline.openclosed;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:16 上午
 */
public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler){
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo){
        for (AlertHandler alertHandler:alertHandlers) {
            alertHandler.check(apiStatInfo);
        }
    }
}
