package behavioral.strategy;

/**
 * @author wangxin
 * 2020/4/5 21:48
 * @since
 **/
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyB");
        //具体的算法...
    }
}
