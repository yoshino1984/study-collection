package behavioral.chain.of.responsibility.list;

/**
 * @author wangxin
 * 2020/3/29 09:57
 * @since
 **/
public class HandlerB implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = true;
        System.out.println(this.getClass());
        return handled;
    }
}
