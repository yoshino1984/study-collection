package creational.sigleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 饿汉式单例模式
 *
 * @author wangxin
 * 2020/4/5 14:25
 * @since
 **/
public class IdGeneratorStaticLazy {
    private AtomicInteger id = new AtomicInteger();

    private static class SingletonHolder {
        private static IdGeneratorStaticLazy instance = new IdGeneratorStaticLazy();
    }

    private IdGeneratorStaticLazy() {}

    public int getId() {
        return id.getAndIncrement();
    }

    public static IdGeneratorStaticLazy getInstance() {
        return SingletonHolder.instance;
    }
}
