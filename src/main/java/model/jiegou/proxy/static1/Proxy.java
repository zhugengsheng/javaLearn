package model.jiegou.proxy.static1;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 9:34 下午
 */
public class Proxy {
    private House house;

    public Proxy(House house) {
        this.house = house;
    }

    public void rent(){
        seeHouse();
        house.rent();
    }

    public void seeHouse(){
        System.out.println("中介带看");
    }
}
