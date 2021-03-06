package structural.proxy.dynamic;

/**
 * 代理模式的实现有两种，
 * 基于组合的方式和基于继承的方式（本处的例子，显示编码的方式）
 * 动态代理的方式
 * @author wangxin
 * 2020/4/5 16:52
 * @since
 **/
public class UserControllerProxy extends UserController{

    private MetricsCollector metricsCollector;

    public UserControllerProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public boolean login() {
        System.out.println("login do something before");
        boolean res = super.login();
        System.out.println("login do something after");

        return res;
    }

    @Override
    public boolean register() {
        System.out.println("register do something before");
        boolean res = super.register();
        System.out.println("register do something after");

        return res;
    }

    public static void main(String[] args) {
        IUserController user = new UserControllerProxy();
        user.register();
    }
}
