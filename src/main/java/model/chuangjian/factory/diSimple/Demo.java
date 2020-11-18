package model.chuangjian.factory.diSimple;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 8:20 上午
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        rateLimiter.test();
    }
}
