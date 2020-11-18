package model.chuangjian.factory.diSimple;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 7:51 上午
 */
public class NoSuchBeanDefinitionException extends RuntimeException {
    public NoSuchBeanDefinitionException(){

    }

    public NoSuchBeanDefinitionException(String s) {
        super(s);
    }

    public NoSuchBeanDefinitionException(String s, Exception e) {
        super(s,e);
    }

    public NoSuchBeanDefinitionException(String s, Throwable cause) {
        super(s, cause);
    }
}
