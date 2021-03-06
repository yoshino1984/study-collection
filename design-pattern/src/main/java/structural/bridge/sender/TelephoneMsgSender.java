package structural.bridge.sender;

import java.util.List;

/**
 * @author wangxin
 * 2020/4/5 17:17
 * @since
 **/
public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println(String.format("send %s to %s", message, telephones));
        //...
    }

}
