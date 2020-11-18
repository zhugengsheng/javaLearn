package model.xingwei.moban.huidiaodemo;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/6 8:02 上午
 */
public class BClass {
    public void process(ICallBack callBack){
        System.out.println(11);
        callBack.methodToCallback();
        System.out.println(222);
    }
}
