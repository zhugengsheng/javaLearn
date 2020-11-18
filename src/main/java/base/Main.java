package base;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 9:40 上午
 */
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            String res = "";
            String[] split = n.split(",");
            Arrays.sort(split);
            for (int i = 0; i < split.length-1; i++) {
                if (split[i].equals(split[i+1])){
                    res += split[i] + " ";
                }
            }
            System.out.println(res);
        }

}
