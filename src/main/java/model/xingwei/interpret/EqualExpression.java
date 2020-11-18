package model.xingwei.interpret;

import java.util.Map;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/16 8:50 上午
 */
public class EqualExpression implements Expression {
    private String key;
    private long value;

    public EqualExpression(String strExpression) {
        //匹配任意空白字符 a  b -》 a,b
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !"==".equals(elements[1].trim())){
            throw new RuntimeException("Expression is invalid:" + strExpression);
        }
        this.key = elements[0];
        this.value = Long.parseLong(elements[2]);
    }

    public EqualExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)){
            return false;
        }
        Long aLong = stats.get(key);
        return aLong == value;
    }
}
