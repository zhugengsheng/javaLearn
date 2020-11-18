package spi;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/8 3:01 下午
 */
public class SpiImpl1 implements SPIService {

    @Override
    public void execute() {
        System.out.println("-------SpiImpl1 execute--------");
    }
}
