package model.xingwei.interpret;

import sun.tools.tree.AddExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/16 8:50 下午
 */
public class OrExpression implements Expression {

    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strOrExpression){
        String[] strExpressions = strOrExpression.trim().split("\\|\\|");
        for (String strEpr : strExpressions) {
           expressions.add(new AndExpression(strEpr));
        }

    }

    public OrExpression(List<Expression> expressions) {
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
