package behavioral.strategy;

/**
 * 策略的使用
 *
 * @author wangxin
 * 2020/4/5 21:49
 * @since
 **/
public class Demo {
    public static void main(String[] args) {
        String strategyKey = "A";
        Strategy strategy = StrategyFactory.getStrategy(strategyKey);
        strategy.algorithmInterface();
    }
}
