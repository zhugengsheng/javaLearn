package thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/18 8:08 上午
 */
public class ThreadLocalDemo1 {
    private static final int HASH_INCREMENT= 0x61c88647;

    public static void main(String[] args) {
        new ReentrantLock();
        int hashCode = 0;
        for (int i = 0; i < 16; i++) {
            hashCode = i * HASH_INCREMENT + HASH_INCREMENT;
            int buket = hashCode & 15;
            System.out.println(i + "桶中位置"+ buket);
        }
    }
}
