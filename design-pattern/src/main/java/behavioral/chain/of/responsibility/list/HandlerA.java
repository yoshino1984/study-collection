package behavioral.chain.of.responsibility.list;

/**
 * @author wangxin
 * 2020/3/29 09:57
 * @since
 **/
public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        System.out.println(this.getClass());
        return handled;
    }
}
