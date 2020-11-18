package model.chuangjian.factory.diSimple;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 7:51 上午
 */
public class BeanCreationFailureException extends RuntimeException {
    public BeanCreationFailureException(){

    }

    public BeanCreationFailureException(String s) {
        super(s);
    }

    public BeanCreationFailureException(String s, Exception e) {
        super(s,e);
    }

    public BeanCreationFailureException(String s, Throwable cause) {
        super(s, cause);
    }
}
