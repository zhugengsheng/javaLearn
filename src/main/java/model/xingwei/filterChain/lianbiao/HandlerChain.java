package model.xingwei.filterChain.lianbiao;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 3:57 下午
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addhandler(Handler handler){
        handler.setSuccessor(null);

        if (head == null){
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;

    }

    public void handler(){
        if (head!=null){
            head.handle();
        }
        new ArrayList<>();
    }
}
