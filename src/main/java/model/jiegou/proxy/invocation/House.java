package model.jiegou.proxy.invocation;


/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 9:33 下午
 */
public class House implements Rent{
    @Override
    public void rent(){
        System.out.println("房东租房子");
    }
}
