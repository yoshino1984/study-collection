package behavioral.interpreter.demo2.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wangxin
 * 2020/4/18 10:32
 * @since
 **/
public class OrExpression implements Expression{
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.split("\\|\\|");
        for (String strExpression : andExpressions) {
            expressions.add(new AndExpression(strExpression));
        }
    }

    public OrExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        for (Expression expression : expressions) {
            if (expression.interpret(stats)) {
                return true;
            }
        }
        return false;
    }
}
