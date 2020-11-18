package javaCode.two;

import java.util.ArrayList;
import java.util.List;

public class test10 {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> sum = new ArrayList<>();
        int allmin = Integer.MAX_VALUE;
        for(int i = 0;i<triangle.size();i++){
            List<Integer> sumIn = new ArrayList<>();
            if (i == 0){
                sumIn.add(triangle.get(0).get(0));
                continue;
            }
            for(int j=0 ;j< triangle.get(i).size();j++){
                int left= Integer.MAX_VALUE;
                if (j-1 >0){
                    left = triangle.get(i-1).get(j-1);
                }
                int right= Integer.MAX_VALUE;
                if (j < triangle.get(i).size()-1){
                    right = triangle.get(i-1).get(j);
                }
                int min = Math.min(left,right);
                sumIn.add(min+triangle.get(i).get(j));
                if (i == triangle.size()-1){
                    allmin = Math.min(allmin,min+triangle.get(i).get(j));
                }
            }
            sum.set(i,sumIn);
        }
        return allmin;
    }
}
