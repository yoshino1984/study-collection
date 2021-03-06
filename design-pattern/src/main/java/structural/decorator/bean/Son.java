package structural.decorator.bean;

public class Son extends Parent{

    @Override
    public void action() {
        System.out.println("出门");
        System.out.println("回家");
    }
}
