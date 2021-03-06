package behavioral.chain.of.responsibility.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxin
 * 2020/3/29 09:58
 * @since
 **/
public class HandleChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(IHandler.class.isAssignableFrom(HandlerA.class));
        HandleChain handleChain = new HandleChain();
        handleChain.addHandler(new HandlerA());
        handleChain.addHandler(new HandlerA());
        handleChain.addHandler(new HandlerB());
        handleChain.addHandler(new HandlerA());
        handleChain.handle();
    }

}
