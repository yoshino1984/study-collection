package structural.bridge.notify;

import structural.bridge.sender.MsgSender;

/**
 * @author wangxin
 * 2020/4/5 17:17
 * @since
 **/
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
