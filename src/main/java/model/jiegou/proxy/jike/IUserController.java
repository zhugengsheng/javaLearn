package model.jiegou.proxy.jike;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/28 8:18 上午
 */
interface IUserController {
    void login(String telephone, String password);
    void register(String telephone, String password);
}