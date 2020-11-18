package model.chuangjian.builder;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/17 11:41 下午
 */
public abstract class Builder {
    Meal meal = new Meal();

    public abstract void setFood();
    public abstract void setDrink();

    public Meal getMeal(){
        return meal;
    }

}
