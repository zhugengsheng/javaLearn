package model.xingwei.moban.huidiaodemo;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/6 8:03 上午
 */
public class AClass {
    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(new ICallBack() {
            @Override
            public void methodToCallback() {
                System.out.println("call back me");
            }
        });
    }
}
