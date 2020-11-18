package javaCode.two;

/**
 * 展示
 */
public class ShowProperties {
    /**
     * 用户名
     */
    private int username;

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
