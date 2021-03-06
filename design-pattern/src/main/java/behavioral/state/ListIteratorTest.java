package behavioral.state;

import com.google.common.base.Stopwatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author wangxin
 * 2020/4/4 17:18
 * @since
 **/
public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(20000000);
//        List<Integer> list = new LinkedList<>();
        IntStream.range(1, 20000000).forEach(list::add);
        Stopwatch stopwatch = Stopwatch.createStarted();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        stopwatch.stop();
        System.out.println(stopwatch);
    }
}
