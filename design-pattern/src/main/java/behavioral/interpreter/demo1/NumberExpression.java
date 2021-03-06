package behavioral.interpreter.demo1;

/**
 * @author wangxin
 * 2020/4/18 10:24
 * @since
 **/
public class NumberExpression implements Expression {
    private long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    public NumberExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
