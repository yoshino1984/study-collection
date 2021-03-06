package structural.bridge.notify;

import structural.bridge.sender.MsgSender;

/**
 * @author wangxin
 * 2020/4/5 17:17
 * @since
 **/
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
