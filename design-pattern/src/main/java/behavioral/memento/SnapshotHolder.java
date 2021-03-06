package behavioral.memento;

import java.util.Stack;

/**
 * @author wangxin
 * 2020/4/14 22:32
 * @since
 **/
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
