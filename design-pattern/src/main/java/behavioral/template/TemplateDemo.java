package behavioral.template;

/**
 * @author wangxin
 * 2020/4/5 21:42
 * @since
 **/
public class TemplateDemo {
    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.method1();
    }
}
