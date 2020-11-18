package math.sort.day1;

import java.util.Arrays;
import java.util.Map;

public class QuickSort {

    public static void quickSort(int[] arr){
        if (arr == null || arr.length<2){
            return ;
        }
        quickSort(arr,0 , arr.length-1);

    }

    public static void quickSort(int[] arr,int l, int r) {
        if (l<r){
            swap(arr, l + (int) (Math.random() * (r - l + 1)),r);
            int[] partition = partition(arr, l, r);
            quickSort(arr,l,partition[0]-1);
            quickSort(arr,partition[0]+1,r);
        }
    }

    public static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        swap(arr, more, r);
        return new int[] { less + 1, more };
    }

//    public static int[] partition(int[] arr,int l, int r, int num){
//        int less = l -1;
//        int more = r +1;
//        int cur = l;
//        while (cur < more){
//            if (arr[cur] < num){
//                swap(arr,cur++, ++less);
//            }else if (arr[cur] > num){
//                swap(arr,cur, --more);
//            }else{
//                cur++;
//            }
//        }
//        return new int[]{less+1,more-1};
//    }

    public static void swap(int[] arr,int left,int right){
        int a = arr[left];
        arr[left] = arr[right];
        arr[right] = a;
    }

    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {

                if (j == 1) break;
                System.out.println("j:"+j);
            }
            System.out.println("i:"+i);
        }
//        int[] arr = generateArray();
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
    }

    public static int[] generateArray(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }
}
