package creational.factory;

import com.google.common.base.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂
 * @author wangxin
 * 2020/4/5 14:47
 * @since
 **/
public class SimpleFactory {
    private static final Map<String, String> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", "jsonParser");
        cachedParsers.put("xml", "xmlParser");
        cachedParsers.put("properties", "propertiesParser");
        cachedParsers.put("yaml", "yamlParser");
    }

    public static String createParser(String config) {
        if (Strings.isNullOrEmpty(config)) {
            return null;
        }
        return cachedParsers.get(config);
    }
}