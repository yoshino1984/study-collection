package behavioral.observer.eventbus.demo;

import com.google.common.eventbus.Subscribe;

/**
 * @author wangxin
 * 2020-03-13 16:56
 * @since
 **/
public class RegNotificationObserver {
//    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Object userId) {
        System.out.printf("notificationService.sendInboxMessage(%s, \"...\");\n", userId);
    }
}
