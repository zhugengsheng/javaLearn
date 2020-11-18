package math.sort.day1;

//复杂度 时间复杂度o(N*logN) 额外空间复杂度o(N)
public class SmallSum {
    public int mergeSort(int[] arr){
        if (arr == null || arr.length<2){
            return 0;
        }
        return mergeSort(arr,0,arr.length-1);
    }

    public int mergeSort(int[] arr, int l, int r){
        if (l == r){
            return 0;
        }
        int mid = (l+r)/2;
        return mergeSort(arr,0,mid) + mergeSort(arr,mid+1,r) + merge(arr,l,mid, r);
    }

    public int merge(int[] arr,int l,int m, int r){
        int[] help = new int[r-l+1];
        int sum = 0;
        int left = l;
        int right = m+1;
        int i = 0;
        while (left<=m && right <=r){
            sum +=  arr[left] < arr[right] ? (r - right +1) * arr[left] : 0;
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
        return sum;
    }

    public static void main(String[] args) {
        SmallSum mergeSortTest = new SmallSum();
        int[] arr = new int[]{1,4,23};
        int sum = mergeSortTest.mergeSort(arr);
        System.out.println(sum);
    }

}
