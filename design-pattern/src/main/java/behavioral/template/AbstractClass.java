package behavioral.template;

/**
 * @author wangxin
 * 2020/4/5 21:41
 * @since
 **/

public abstract class AbstractClass {
    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();
    protected abstract void method2();
}
