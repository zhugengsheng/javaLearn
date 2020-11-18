package model.xingwei.filterChain.lianbiao;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 4:00 下午
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addhandler(new HandlerA());
        handlerChain.addhandler(new HandlerB());
        handlerChain.handler();
    }
}
