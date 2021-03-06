package creational.factory.parser;

/**
 * 工厂方法类
 * @author wangxin
 * 2020/4/5 15:00
 * @since
 **/
public class JsonParserFactory implements IParserFactory{

    @Override
    public String createParser() {
        // 创建的是个具体的对象
        return "jsonParser";
    }
}
