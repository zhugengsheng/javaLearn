package model.chuangjian.factory.simple;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 10:47 下午
 */
public class CarFactory {
    public static Car getCar(String name){
        if ("五菱宏光".equals(name)){
            return new Wuling();
        }else if ("Telsa".equals(name)){
            return new Telsa();
        }else{
            return null;
        }
    }
}
