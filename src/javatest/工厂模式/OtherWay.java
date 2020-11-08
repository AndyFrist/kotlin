package javatest.工厂模式;

import javatest.工厂模式.具体产品.AsusComputer;
import javatest.工厂模式.具体产品.HPComputer;
import javatest.工厂模式.具体产品.LenovoComputer;

import java.util.HashMap;
import java.util.Map;

/**
 * 第二种实现方法
 *
 *
 * 为了节省内存和对象创建的时间，我们可以将 parser 事先创建好缓存起来。
 *
 */

public class OtherWay {
    private static final Map<String, Computer> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new LenovoComputer());
        cachedParsers.put("xml", new HPComputer());
        cachedParsers.put("yaml", new AsusComputer());
    }

    public static Computer createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你自己说了算
        }
        Computer parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
