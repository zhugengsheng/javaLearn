package model.xingwei.filterChain.array;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 11:45 上午
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        SensitiveWordFilterChain sensitiveWordFilterChain = new SensitiveWordFilterChain();
        sensitiveWordFilterChain.addFilter(new SexWordFilter());
        sensitiveWordFilterChain.addFilter(new AbsWordFilter());

        boolean sb = sensitiveWordFilterChain.filter("sb");
        if (sb){
            System.out.println("不发表");
        }else{
            System.out.println("发表");
        }
    }
}
