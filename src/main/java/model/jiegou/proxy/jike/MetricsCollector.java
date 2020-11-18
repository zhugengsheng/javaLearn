package model.jiegou.proxy.jike;

/**
 * @author zhugenghseng
 */
public class MetricsCollector {
    private MetricsStorage metricsStorage;

    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo) {
        if(requestInfo == null || requestInfo.getApiName().isEmpty()) {
            return;
        }

        metricsStorage.saveRequestInfo(requestInfo);
    }
}
