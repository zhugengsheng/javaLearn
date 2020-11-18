package model.jiegou.proxy.proxy.staticproxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    //目标对象，通过接口聚合
    private Internet internet;

    // 通过构造方法传入目标对象
    public ProxyInternet(Internet internet){
        this.internet = internet;
    }
    //网络黑名单
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("bilibili.com");
        bannedSites.add("youtube.com");
        bannedSites.add("weibo.com");
        bannedSites.add("qq.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        // 添加限制功能
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied:"+serverhost); //拒绝访问
        }
        internet.connectTo(serverhost);
    }
}
