package model.xingwei.filterChain.lianbiao;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 3:52 下午
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle(){
        doHandle();
        if (successor != null){
            successor.handle();
        }
    }

    protected abstract void doHandle();
}
