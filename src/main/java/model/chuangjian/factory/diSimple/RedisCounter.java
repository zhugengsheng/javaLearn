package model.chuangjian.factory.diSimple;

import lombok.Data;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 8:31 上午
 */
@Data
public class RedisCounter {
    private String ipAddress;
    private String port;
    public RedisCounter(String ipAddress, String port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }
    //...
}
