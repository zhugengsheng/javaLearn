package math.sort.day1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = bubbleSort1(new int[]{1, 3, 2, 5, 9, 5, 6});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] bubbleSort1(int[] arr){
        if (arr == null || arr.length<2){
            return arr;
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i -1; j++) {
//                if (arr[j]>arr[j+1]){
//                    swap(arr,j,j+1);
//                }
//            }
//        }
        for (int end = arr.length; end >0; end--){
            for (int i = 0; i < end-1; i++) {
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
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
