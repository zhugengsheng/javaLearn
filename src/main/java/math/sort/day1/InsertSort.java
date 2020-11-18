package math.sort.day1;

import java.util.Arrays;

/**
 * 插入排序的时间复杂度，与数据情况有关，可能是N 也可能N^2
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] ints = insertSort1(new int[]{1, 3, 2, 5, 9, 5, 6});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] insertSort1(int[] arr){
        if (arr == null || arr.length<2){
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr, j-1,j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int i, int j){

        int value = arr[i];
        arr[i] = arr[j];
        arr[j] = value;
    }
}
