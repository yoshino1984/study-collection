package behavioral.template;

/**
 * @author wangxin
 * 2020/4/5 21:41
 * @since
 **/
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void method1() {
        System.out.println("ConcreteClass1.method1");
        //...
    }

    @Override
    protected void method2() {
        System.out.println("ConcreteClass1.method2");
        //...
    }
}
