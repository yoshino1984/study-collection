package behavioral.interpreter.demo2.expression;

import java.util.Map;

/**
 * @author wangxin
 * 2020/4/18 10:24
 * @since
 **/
public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
