package model.xingwei.filterChain.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/8 11:42 上午
 */
public class SensitiveWordFilterChain {
    List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter){
        filters.add(filter);
    }

    public boolean filter(String content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
