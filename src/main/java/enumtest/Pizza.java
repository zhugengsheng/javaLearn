package enumtest;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/22 8:58 上午
 */
@Data
@AllArgsConstructor
public class Pizza {

    private static PizzaStatus status;
    public enum  PizzaStatus{
        ORDER,
        OK,
        DELIVERED;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        Pizza.status = status;
    }

    public boolean isDelivered(){
        if (getStatus() == PizzaStatus.DELIVERED){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setStatus(PizzaStatus.OK);
        System.out.println(pizza.isDelivered());
    }
}
