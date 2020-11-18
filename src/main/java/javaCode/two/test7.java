package javaCode.two;

import java.util.Stack;

public class test7 {

    public static void main(String[] args) {
//        String s = addBinary("11 1", "1");
//        System.out.println(s);
//        StringBuilder ss = new StringBuilder();
//        s = String.valueOf(ss);
        int i = hammingDistance(1, 4);
        System.out.println(i);
    }

    public static int hammingDistance(int x, int y) {
        int value = x ^ y;
        char[] arr = Integer.toBinaryString(value).toCharArray();
        int all = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                all++;
            }
        }
        return all;
    }

    public static String addBinary(String a, String b) {
        char[] aarr = a.toCharArray();
        char[] barr = b.toCharArray();
        int aindex = aarr.length-1;
        int bindex = barr.length-1;
        String res = "";
        int lest=0;
        while(aindex>=0 && bindex>=0){
            if(aarr[aindex]=='1'&& barr[bindex]=='1'){
                if(lest==0){
                    res ="0" + res;
                    lest=1;
                }else{
                    res ="1" + res;
                }
            }else if(aarr[aindex]=='0'&& barr[bindex]=='0'){
                if(lest==0){
                    res ="0"+ res;
                }else{
                    res ="1"+ res;
                    lest=0;
                }
            }else{
                if(lest==0){
                    res ="1"+ res;
                }else{
                    res ="0"+ res;
                    lest=1;
                }
            }
            aindex--;
            bindex--;
        }
        while(aindex>=0){
            if(aarr[aindex]=='0' && lest==1){
                res ="1"+ res;
                lest = 0;
            }else if(aarr[aindex]=='0' && lest==0){
                res ="0"+ res;
            }else if(aarr[aindex]=='1' && lest==0){
                res ="1"+ res;
            }else if(aarr[aindex]=='1' && lest==1){
                res ="0"+ res;
                lest=1;
            }
            aindex--;
        }
        while(bindex>=0){
            if(barr[bindex]=='0' && lest==1){
                res ="1"+ res;
                lest = 0;
            }else if(barr[bindex]=='0' && lest==0){
                res ="0"+ res;
            }else if(barr[bindex]=='1' && lest==0){
                res ="1"+ res;
            }else if(barr[bindex]=='1' && lest==1){
                res ="0"+ res;
                lest=0;
            }
            aindex--;
        }
        if (lest==1){
            res ="1"+ res;
        }
        return res;
    }

    public String removeOuterParentheses(String S) {
        char[] arr = S.toCharArray();
        int index = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '('){
                if (index>0){
                    str.append("(");
                }
                index++;
            }else{
                if (index>1){
                    str.append(")");
                }
                index--;
            }
        }
        return String.valueOf(str);
    }


    public int countNegatives(int[][] grid) {
        int all = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]>0){
                    all++;
                }else {
                    break;
                }
            }
        }
        return all;
    }
}
