package model.chuangjian.builder;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/17 11:44 下午
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    private Meal construct(){
        builder.setFood();
        builder.setDrink();
        return builder.meal;
    }

    public static void main(String[] args) {
        Meal construct = new Director(new PartenB()).construct();
        System.out.println(construct.getDrink());
        System.out.println(construct.getFood());
    }
}
