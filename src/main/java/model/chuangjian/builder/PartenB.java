package model.chuangjian.builder;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/17 11:43 下午
 */
public class PartenB extends Builder {

    @Override
    public void setFood() {
        meal.setFood("薯条");
    }

    @Override
    public void setDrink() {
        meal.setDrink("开水");
    }
}
