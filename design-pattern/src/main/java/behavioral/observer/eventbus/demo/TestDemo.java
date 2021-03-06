package behavioral.observer.eventbus.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxin
 * 2020-03-13 16:57
 * @since
 **/
public class TestDemo {

        public static void main(String[] args) {
        UserController userController = new UserController();
        List<Object> observers = new ArrayList<>();
        observers.add(new RegNotificationObserver());
        observers.add(new RegPromotionObserver());
        userController.setRegObservers(observers);
        userController.register("1", "1");
        System.out.println("finish");
    }
}
