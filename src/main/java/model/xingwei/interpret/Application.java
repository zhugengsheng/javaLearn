package model.xingwei.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/16 9:11 下午
 */
public class Application {
    public static void main(String[] args) {
        AlertRuleInterpreter alertRuleInterpreter = new AlertRuleInterpreter("key1 < 100 && key2 > 200");
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1",90L);
        stats.put("key2",220L);
        boolean interpret = alertRuleInterpreter.interpret(stats);
        System.out.println(interpret);
    }
}
