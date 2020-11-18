package model.chuangjian.factory.diSimple;

import lombok.Data;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/26 8:30 上午
 */
@Data
public class RateLimiter {

        private RedisCounter redisCounter;
        public RateLimiter(RedisCounter redisCounter) {
            this.redisCounter = redisCounter;
        }
        public void test() {
            System.out.println("Hello World!");
        }
        //...

}
