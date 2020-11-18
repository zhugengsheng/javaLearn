package model.jiegou.pripline.openclosed;

import lombok.Data;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/10 7:25 上午
 */
@Data
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
}
