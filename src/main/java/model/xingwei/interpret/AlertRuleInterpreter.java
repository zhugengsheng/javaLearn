package model.xingwei.interpret;

import java.util.Map;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/16 9:10 下午
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression){
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats){
        return expression.interpret(stats);
    }
}
