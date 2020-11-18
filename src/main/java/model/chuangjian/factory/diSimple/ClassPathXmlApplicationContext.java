package model.chuangjian.factory.diSimple;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 8:15 上午
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation){
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParse();
        loadBeanDefinitions(configLocation);
    }

    private void loadBeanDefinitions(String configLocation){
        InputStream in = null;
        try {
            in = this.getClass().getResourceAsStream("/config/"+configLocation);
            if (in == null){
                throw new RuntimeException("can not find config file:" + configLocation);
            }
            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}
