package spi;


import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/8 3:02 下午
 */
public class Test {
    public static void main(String[] args) {
        //sun.misc.Service
        Iterator<SPIService> providers = Service.providers(SPIService.class);

        while (providers.hasNext()){
            SPIService next = providers.next();
            next.execute();
        }

        System.out.println("==============");
        //java.util包
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
        Iterator<SPIService> iterator = load.iterator();
        while (iterator.hasNext()){
            SPIService next = iterator.next();
            next.execute();
        }
    }
}
