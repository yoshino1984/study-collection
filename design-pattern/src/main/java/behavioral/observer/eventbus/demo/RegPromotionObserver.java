package behavioral.observer.eventbus.demo;

import com.google.common.eventbus.Subscribe;

/**
 * @author wangxin
 * 2020-03-13 16:56
 * @since
 **/
public class RegPromotionObserver {
//    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(Long userId) throws InterruptedException {
        System.out.printf("promotionService.issueNewUserExperienceCash(%s)\n", userId);
        Thread.sleep(5000);
    }
}
