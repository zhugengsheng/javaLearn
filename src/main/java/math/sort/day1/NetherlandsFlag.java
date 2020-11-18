package math.sort.day1;

import java.util.Arrays;

public class NetherlandsFlag {
    public static int[] partition(int[] arr,int l, int r, int num){
        int less = l -1;
        int more = r +1;
        int cur = l;
        while (cur < more){
            if (arr[cur] < num){
                swap(arr,cur++, ++less);
            }else if (arr[cur] > num){
                swap(arr,cur, --more);
            }else{
                cur++;
            }
        }
        return new int[]{less+1,more-1};
    }

    public static void swap(int[] arr,int left,int right){
        int a = arr[left];
        arr[left] = arr[right];
        arr[right] = a;
    }

    public static void main(String[] args) {
        int[] arr = generateArray();
        int[] res = partition(arr,0,arr.length-1,5);
        System.out.println(Arrays.toString(res));
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
