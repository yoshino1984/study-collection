package structural.decorator.bean;

/**
 * @author wangxin
 * 2020/11/26 下午11:26
 * @since
 **/
public class Cloth extends Parent{

    Parent parent;

    public Cloth(Parent parent) {
        this.parent = parent;
    }

    @Override
    public void action() {
        System.out.println("穿上衣服");
        parent.action();
        System.out.println("脱下衣服");
    }
}
