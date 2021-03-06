package structural.bridge.notify;

import structural.bridge.sender.MsgSender;

/**
 * @author wangxin
 * 2020/4/5 17:17
 * @since
 **/
public class TrivialNotification extends Notification {

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
    // 与SevereNotification代码结构类似，所以省略...
}
