package math.sort.day1;

import java.util.Arrays;

public class SectionSort {
    public static void main(String[] args) {
        int[] ints = sectionSort1(new int[]{1, 3, 2, 5, 9, 5, 6});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sectionSort1(int[] arr){
        if (arr == null || arr.length<2){
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr,i,index);
        }
        return arr;
    }

    public static void swap(int[] arr,int i, int j){
        int value = arr[i];
        arr[i] = arr[j];
        arr[j] = value;
    }
}
