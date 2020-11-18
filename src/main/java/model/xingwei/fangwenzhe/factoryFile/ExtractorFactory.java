package model.xingwei.fangwenzhe.factoryFile;

import javaCode.fifteen.GenericArrayWithTypeToken;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:33 上午
 */
public class ExtractorFactory {
    private static Map<ResourceType, Extractor> map = new HashMap<>();

    static {
        map.put(ResourceType.PDF, (Extractor) new PdfExtractor());
        map.put(ResourceType.PPT, (Extractor) new PPPTExtractor());
    }

    public static Extractor getExtractor(ResourceType type){
        return map.get(type);
    }
}
