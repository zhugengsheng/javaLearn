package base;

import java.util.Arrays;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/13 11:02 下午
 */
@Foo(value = {"sherman","decompiler"},bar = true)
public class Demo {
    public static void main(String[] args) {
        Foo annotation = Demo.class.getAnnotation(Foo.class);
        System.out.println(Arrays.toString(annotation.value()));
        System.out.println(annotation.bar());

    }
}
