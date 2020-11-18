package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        String[] b = new String[];
//        List a = Arrays.asList(b);
//        a.contains("a");
//
//        String c = "aa";
//        char[] chars = c.toCharArray();
//        int n =21;
//        String[] num = Integer.toString(n).split("");
//        int cc = Integer.parseInt(num[1]);
//        String address="1.1.1.1";
//        String[] arr = address.split(".");
//        System.out.println(Arrays.toString(arr));

        int a = 10^2;
        System.out.println(a);
        String url = "/Users/zhuangqianmei/Downloads/maven-repository/com/anjuke/panshiconst/panshi-const/1.0.1/panshi-const-1.0.1.jar\n";
        String[] split = url.split("/");
        StringBuffer strNew = new StringBuffer();
        int index = 0;
        for (int i = 0; i < split.length-1; i++) {
            if (split[i].equals("maven-repository")){
                index = i;
                break;
            }
        }
        for (int i = index+1; i < split.length-1; i++) {
            strNew.append(split[i] + "/");
        }
        strNew.append(split[ split.length-1]);
        System.out.println(strNew);
    }

    public int findNumbers(int[] nums) {
        int ou = 0;
        for(int i=0;i<nums.length;i++){
            int index=1;
            while((nums[i]/Math.pow(10,index)) > 1){
                index++;
            }
            if((index-1)%2 == 0){
                ou++;
            }
        }
        return ou;
    }
}
