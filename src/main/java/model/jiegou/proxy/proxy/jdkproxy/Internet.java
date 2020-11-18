package model.jiegou.proxy.proxy.jdkproxy;

/**
 * @author zhugenghseng
 */
public interface Internet {
    /**
     *
     * @param serverHost
     * @throws Exception
     */
    void connectTo(String serverHost) throws Exception;
}
