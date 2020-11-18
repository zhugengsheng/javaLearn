package javaCode.two;


import Leetcode.TreeNode;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        maxScoreSightseeingPair(new int[]{8,1,5,2,6});
    }
    public static int maxScoreSightseeingPair(int[] A) {
        int max =0;
        int index = 0;

        for (int i = 1; i < A.length; i++) {
            int value = A[index]+A[i]+index-i;
            max = Math.max(max, value);
            if (A[index]-(i-index) - A[i]<0){
                index = i;
            }
        }
        return max;
    }

    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10,n);
        int[] res = new int[max-1];
        for(int i = 0;i<max;i++){
            res[i]=i+1;
        }
        return res;
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root==null || root.left==null || root.right==null){
            return root;
        }
        TreeNode mid = root.left;
        root.left = root.right;
        root.right = mid;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
