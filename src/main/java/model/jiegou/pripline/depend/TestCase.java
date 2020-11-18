package model.jiegou.pripline.depend;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/11 3:59 下午
 */
public abstract class TestCase {
    public void run(){
        if (doTest()){
            System.out.println("test success");
        }else {
            System.out.println("test failed");
        }
    }

    public abstract boolean doTest();
}
