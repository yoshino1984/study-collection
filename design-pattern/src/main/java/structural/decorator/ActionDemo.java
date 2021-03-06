package structural.decorator;

import structural.decorator.bean.Cloth;
import structural.decorator.bean.Parent;
import structural.decorator.bean.Son;

public class ActionDemo {
    public static void main(String[] args) {
        Parent son = new Son();
        Parent cloth = new Cloth(son);
        cloth.action();
    }
}
