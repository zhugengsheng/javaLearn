package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test4 {
    public static void main(String[] args) {
        Integer f1 =100,f2=100,f3=150,f4=150;
        System.out.println(f1==f2);
        System.out.println(f3==f4);
        int bestValue = findBestValue(new int[]{2, 3, 5}, 10);
        System.out.println(bestValue);
    }

    public static int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int dis = Integer.MAX_VALUE;
        int sumMins = 0;
        int min = 0;
        int arrIndex = 0;
        for(int i=0;i<arr.length;i++){
            int value = (target-sumMins)/(arr.length-i);
            if (value <= arr[i]){
                double curValue = (target* 1.0 -sumMins)/(arr.length-i);
                if (curValue-value <= 0.5){
                    return value;
                }else{
                    return value+1;
                }
            }
            sumMins +=arr[i];
        }

        return arr[arr.length-1];
    }
}
