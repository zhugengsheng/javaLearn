package math.sort.day1;

public class Test222 {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4,3,6};
        System.out.println(getMax(arr,0,arr.length-1));
    }
    public static int getMax(int[] arr, int l, int r){
        if (l == r){
            return arr[l];
        }
        int mid = (l+r)/2;
        int val1 = getMax(arr,0,mid);
        int val2 = getMax(arr,mid+1,r);
        return Math.max(val1,val2);
    }

}
