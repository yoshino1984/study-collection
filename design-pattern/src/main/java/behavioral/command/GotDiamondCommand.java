package behavioral.command;

/**
 * @author wangxin
 * 2020/4/18 09:54
 * @since
 **/
public class GotDiamondCommand implements Command {
    private String name;
    private String action;

    public GotDiamondCommand() {
        //...
    }

    @Override
    public void execute() {
        // 执行相应的逻辑
        System.out.println("执行：GotDiamondCommand");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
