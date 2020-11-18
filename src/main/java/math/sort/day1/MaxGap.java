package math.sort.day1;

import java.util.Arrays;

public class MaxGap {

	public static int maxGap(int[] nums) {
		if (nums == null || nums.length<2){
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int length = nums.length;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max,nums[i]);
			min = Math.min(min,nums[i]);
		}
		if (max == min){
			return 0;
		}
		boolean[] have = new boolean[length+1];
		int[] maxarr = new int[length+1];
		int[] minarr = new int[length+1];
		int bid = 0 ;
		for (int i = 0; i < length; i++) {
			bid = bucket(nums[i],length,min,max);
			maxarr[bid] = have[bid] ? Math.max(maxarr[bid], nums[i]) : nums[i];
			minarr[bid] = have[bid] ? Math.min(minarr[bid], nums[i]) : nums[i];
			have[bid] = true;
		}
		int largest =  maxarr[0];  //差值最大 必定不来自于同一个桶中
		int res = 0;
		for (int i = 1; i <= length; i++) {
			if (have[i]){
				res = Math.max(res,minarr[i]-largest);
				largest = maxarr[i];
			}
		}
		return res;
	}

	public static int bucket(long num, long len, long min, long max) {
		return (int) ((num - min) * len / (max - min));
	}

	// for test
	public static int comparator(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		Arrays.sort(nums);
		int gap = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			gap = Math.max(nums[i] - nums[i - 1], gap);
		}
		return gap;
	}

	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		return arr;
	}

	// for test
	public static int[] copyArray(int[] arr) {
		if (arr == null) {
			return null;
		}
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}

	// for test
	public static void main(String[] args) {
		int testTime = 500000;
		int maxSize = 100;
		int maxValue = 100;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);
			if (maxGap(arr1) != comparator(arr2)) {
				succeed = false;
				break;
			}
		}
		System.out.println(succeed ? "Nice!" : "Fucking fucked!");
	}

}
