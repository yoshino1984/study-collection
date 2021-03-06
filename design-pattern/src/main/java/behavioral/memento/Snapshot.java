package behavioral.memento;

/**
 * @author wangxin
 * 2020/4/14 22:36
 * @since
 **/
public class Snapshot {
    private final String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
