package behavioral.interpreter.demo2;

import behavioral.interpreter.demo2.expression.Expression;
import behavioral.interpreter.demo2.expression.OrExpression;

import java.util.Map;

/**
 * @author wangxin
 * 2020/4/18 10:27
 * @since
 **/

public class AlertRuleInterpreter {
    Expression expression;

    // key1 > 100 && key2 < 1000 || key3 == 200
    public AlertRuleInterpreter(String ruleExpression) {
        expression = new OrExpression(ruleExpression);
    }

    //<String, Long> apiStat = new HashMap<>();
    //apiStat.put("key1", 103);
    //apiStat.put("key2", 987);
    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }

}

