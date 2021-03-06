package behavioral.interpreter.demo2.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wangxin
 * 2020/4/18 10:32
 * @since
 **/
public class AndExpression implements Expression{
    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String strAndExpression) {
        String[] strExpressions = strAndExpression.split("&&");
        for (String strExpression : strExpressions) {
            if (strExpression.contains(">")) {
                expressions.add(new GreaterExpression(strExpression));
            } else if (strExpression.contains("<")) {
                expressions.add(new LessExpression(strExpression));
            } else if (strExpression.contains("==")) {
                expressions.add(new EqualExpression(strExpression));
            } else {
                throw new RuntimeException("Expression is invalid: " + strExpression);
            }
        }
    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }


    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : expressions) {
            if (!expression.interpret(stats)) {
                return false;
            }
        }
        return true;
    }
}
