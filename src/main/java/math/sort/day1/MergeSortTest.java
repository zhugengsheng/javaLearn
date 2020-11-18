package math.sort.day1;

import java.util.Arrays;

//复杂度 时间复杂度o(N*logN) 额外空间复杂度o(N)
public class MergeSortTest {
    public void mergeSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }
        mergeSort(arr,0,arr.length-1);
    }

    public void mergeSort(int[] arr, int l, int r){
        if (l == r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid, r);
    }

    public void merge(int[] arr,int l,int m, int r){
        int[] help = new int[r-l+1];
        int left = l;
        int right = m+1;
        int i = 0;
        while (left<=m && right <=r){
            help[i++] = arr[left]>arr[right] ? arr[right++]:arr[left++];
        }
        while (left<=m){
            help[i++] = arr[left++];
        }
        while (right<=r){
            help[i++] = arr[right++];
        }
        for (int j = 0; j <help.length; j++) {
            arr[l+j] = help[j];
        }
    }

    public static void main(String[] args) {
        MergeSortTest mergeSortTest = new MergeSortTest();
        int[] arr = new int[]{1,4,23,123,2,5,3};
        mergeSortTest.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
