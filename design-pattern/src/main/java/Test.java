import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author wangxin
 * 2020-03-09 22:55
 * @since
 **/
public class Test {
    static CopyOnWriteArraySet<Integer> set1 =  new CopyOnWriteArraySet();


    public static void main(String[] args) throws ClassNotFoundException {
        CopyOnWriteArraySet set2 = set1;
        set1.add(1);
        Class.forName("com.mysql.jdbc.Driver");

    }
}
