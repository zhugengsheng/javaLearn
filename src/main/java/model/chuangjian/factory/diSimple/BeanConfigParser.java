package model.chuangjian.factory.diSimple;

import java.io.InputStream;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 7:34 上午
 */
public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
    List<BeanDefinition> parse(String configContent);

}
