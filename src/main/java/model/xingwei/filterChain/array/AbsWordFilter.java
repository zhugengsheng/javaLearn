package model.xingwei.filterChain.array;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 11:41 上午
 */
public class AbsWordFilter implements SensitiveWordFilter {

    @Override
    public boolean doFilter(String content) {
        System.out.println("abs filter");
        return true;
    }
}
