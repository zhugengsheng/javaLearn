package model.xingwei.interpret;

import java.util.Map;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/16 8:49 上午
 */
public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
