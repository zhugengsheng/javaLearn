package Leetcode;

public class test1 {
    public static void main(String[] args) {

        int numbers = findNumbers(new int[]{12, 2, 4, 132, 1241});
        System.out.println(numbers);

    }

    public static int findNumbers(int[] nums) {
        int ou = 0;
        for(int i=0;i<nums.length;i++){
            int index=1;
            while((nums[i]/Math.pow(10,index)) > 1){
                index++;
            }
            if((index)%2 == 0){
                ou++;
            }
        }
        return ou;
    }
}
