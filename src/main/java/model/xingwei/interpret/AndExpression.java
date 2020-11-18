package model.xingwei.interpret;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/16 8:50 下午
 */
public class AndExpression implements Expression {

    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String strAndExpression){
        String[] strExpressions = strAndExpression.trim().split("&&");
        for (String strEpr : strExpressions) {
            if (strEpr.contains(">")) {
                expressions.add(new GreateExpression(strEpr));
            }else if (strEpr.contains("<")) {
                expressions.add(new LessExpression(strEpr));
            }else if (strEpr.contains("==")) {
                expressions.add(new EqualExpression(strEpr));
            }else{
                throw new RuntimeException("Expression is invalid :" + strAndExpression);
            }
        }

    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }


    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expr : expressions) {
            if (!expr.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}
