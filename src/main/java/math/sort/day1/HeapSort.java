package math.sort.day1;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            heapInsert(arr,i);
        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize >0 ){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }

    }

    public static void heapInsert(int[] arr, int i){
        while (arr[i]>arr[(i-1)/2]){
            swap(arr,i,(i-1)/2);
            i = (i-1)/2;
        }
    }
    public static void heapify(int[] arr, int index, int heapSize){
        int left = 2*index+1;
        while (left<heapSize){
            int lager= left+1<heapSize && arr[left]<arr[left+1] ? left+1:left;
            if (arr[lager] > arr[index]){
                swap(arr,index,lager);
                index = lager;
                left = 2*index+1;
            }else {
                break;
            }
        }
    }

    public static void swap(int[] arr,int left,int right){
        int a = arr[left];
        arr[left] = arr[right];
        arr[right] = a;
    }

    public static void main(String[] args) {
        int[] arr = generateArray();
        heapSort(arr);
//        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(arr));
    }

    public static int[] generateArray(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }
}
