package structural.proxy.dynamic;

/**
 * @author wangxin
 * 2020-02-23 11:22
 * @since
 **/
public class UserController implements IUserController{
    static int i = 0;

    @Override
    public boolean login() {
        int i = 1000000;
        while (i-- > 10) {}
        return false;
    }

    @Override
    public boolean register() {
        return true;
    }

    class User {
        int i = 0;
    }
}