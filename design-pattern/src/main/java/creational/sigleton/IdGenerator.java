package creational.sigleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 饿汉式单例模式
 * lazy-load
 * 双重检测 volatile
 * 静态内部类的方式
 * 枚举单例实现
 *
 * @author wangxin
 * 2020/4/5 14:25
 * @since
 **/
public class IdGenerator {
    private AtomicInteger id = new AtomicInteger();

    private volatile static IdGenerator instance = new IdGenerator();

    private IdGenerator() {}

    public int getId() {
        return id.getAndIncrement();
    }

    public static IdGenerator getInstance() {
        return instance;
    }
}
