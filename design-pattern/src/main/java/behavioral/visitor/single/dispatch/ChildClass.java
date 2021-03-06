package behavioral.visitor.single.dispatch;

/**
 * @author wangxin
 * 2020/4/10 20:57
 * @since
 **/
public class ChildClass extends ParentClass {

    @Override
    public void f() {
        System.out.println("I am ChildClass's f().");
    }
}
