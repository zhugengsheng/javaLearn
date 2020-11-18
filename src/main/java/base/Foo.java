package base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/13 11:01 下午
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Foo {
    String[] value();
    boolean bar();
}
