package behavioral.visitor.single.dispatch;

/**
 * 选取对象是在运行时决定， 选取方法是在编译时决定
 * @author wangxin
 * 2020/4/10 20:57
 * @since
 **/
public class DemoMain {
    public static void main(String[] args) {
        SingleDispatchClass demo = new SingleDispatchClass();
        ParentClass p = new ChildClass();
        //执行哪个对象的方法，由对象的实际类型决定
        demo.polymorphismFunction(p);
        //执行对象的哪个方法，由参数对象的声明类型决定
        demo.overloadFunction(p);
    }
}

