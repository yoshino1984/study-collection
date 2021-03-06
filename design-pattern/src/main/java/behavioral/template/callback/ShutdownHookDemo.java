package behavioral.template.callback;

/**
 * @author wangxin
 * 2020/3/21 15:28
 * @since
 **/
public class ShutdownHookDemo {

    private static class ShutdownHook extends Thread {
        @Override
        public void run() {
            System.out.println("I am called during shutting down.");
        }
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }

}
