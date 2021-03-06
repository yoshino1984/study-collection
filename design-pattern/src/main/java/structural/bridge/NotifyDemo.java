package structural.bridge;

import com.google.common.collect.Lists;
import structural.bridge.notify.NormalNotification;
import structural.bridge.notify.Notification;
import structural.bridge.sender.TelephoneMsgSender;

/**
 * 桥接模式，组合解耦两个变化维度
 *
 * @author wangxin
 * 2020/4/5 17:17
 * @since
 **/
public class NotifyDemo {
    public static void main(String[] args) {
        Notification normal = new NormalNotification(new TelephoneMsgSender(Lists.asList("188", new String[]{})));
        normal.notify("hello");
    }
}

