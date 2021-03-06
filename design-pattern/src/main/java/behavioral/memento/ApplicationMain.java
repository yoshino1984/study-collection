package behavioral.memento;

/**
 * @author wangxin
 * 2020/4/14 22:39
 * @since
 **/
public class ApplicationMain {
    public static void main(String[] args) {
        SnapshotHolder holder = new SnapshotHolder();
        InputText inputText = new InputText();
        inputText.append("yo");
        inputText.append("shi");
        holder.pushSnapshot(inputText.createSnapshot());
        inputText.append("no");
        holder.pushSnapshot(inputText.createSnapshot());
        inputText.append(" yes");
        System.out.println(inputText.getText());
        inputText.restoreSnapshot(holder.popSnapshot());
        System.out.println(inputText.getText());
        inputText.restoreSnapshot(holder.popSnapshot());
        System.out.println(inputText.getText());
    }
}
