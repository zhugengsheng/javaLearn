package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add()
        int[] nums = {8,1,2,2,3,4};
        int[] numss = Arrays.copyOf(nums,nums.length);
        Arrays.sort(numss);
        Map<Integer,Integer> recode = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            recode.put(numss[i],i);
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = recode.get(nums[i]);
        }
        System.out.println(Arrays.toString(res));


    }


}
