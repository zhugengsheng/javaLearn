package model.xingwei.observer.envetBus;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/4 8:34 上午
 */
public class RegPromotionObserver {

    private PromotionService promotionService;

    public RegPromotionObserver(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
