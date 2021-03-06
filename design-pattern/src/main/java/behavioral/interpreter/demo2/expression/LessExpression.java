package behavioral.interpreter.demo2.expression;

import java.util.Map;

/**
 * @author wangxin
 * 2020/4/18 10:37
 * @since
 **/
public class LessExpression implements Expression{
    private String key;
    private long value;

    public LessExpression(String strExpression) {
        String [] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !"<".equals(elements[1])) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        key = elements[0].trim();
        value = Long.parseLong(elements[2]);
    }

    @Override
    public boolean interpret(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        return stats.get(key) < value;
    }
}
