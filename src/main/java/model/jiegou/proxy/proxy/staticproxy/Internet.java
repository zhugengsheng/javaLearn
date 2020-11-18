package model.jiegou.proxy.proxy.staticproxy;

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
