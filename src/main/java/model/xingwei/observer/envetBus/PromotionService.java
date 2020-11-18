package model.xingwei.observer.envetBus;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/4 8:35 上午
 */
public class PromotionService {
    public void issueNewUserExperienceCash(Long userId){
        System.out.println("发放代金劵给：" + userId);
    }
}
