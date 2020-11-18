package model.jiegou.pripline.depend;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/11 4:01 下午
 */
public class JunitApplication {
    private static final List<TestCase> testCases = new ArrayList<>();

    public static void register(TestCase testCase){
        testCases.add(testCase);
    }

    public static void main(String[] args) {
        for (TestCase case1 : testCases){
            case1.run();
        }
    }
}
