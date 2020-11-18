package model.xingwei.filterChain.array;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 11:40 上午
 */
public interface SensitiveWordFilter {
    boolean doFilter(String content);
}
