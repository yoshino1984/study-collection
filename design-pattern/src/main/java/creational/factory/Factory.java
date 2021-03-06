package creational.factory;

import com.google.common.base.Strings;
import creational.factory.parser.IParserFactory;
import creational.factory.parser.JsonParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂方法：适合比较复杂的场景
 * 使用简单工厂方法创建工厂，工厂类封装具体的创建实现
 *
 * @author wangxin
 * 2020/4/5 14:47
 * @since
 **/
public class Factory {

    private static final Map<String, IParserFactory> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonParserFactory());
//        cachedParsers.put("xml", new JsonParserFactory());
//        cachedParsers.put("properties", new JsonParserFactory());
//        cachedParsers.put("yaml", new JsonParserFactory());
    }

    public static IParserFactory createParserFactory(String config) {
        if (Strings.isNullOrEmpty(config)) {
            return null;
        }
        return cachedParsers.get(config);
    }

    public static void main(String[] args) {
        IParserFactory factory = Factory.createParserFactory("json");
        assert factory != null;
        System.out.println(factory.createParser());
    }
}
