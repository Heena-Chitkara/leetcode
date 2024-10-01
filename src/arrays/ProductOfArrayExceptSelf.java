package arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	public static void main(String[] args) {
		int[] arr = getProduct(new int[] {1,2,3,4});
		
		Arrays.stream(arr).forEach(System.out::println);
		
	}

	public static int[] getProduct(int[] nums) {
		int[] output = new int[nums.length];
		 int[] prefixSum = new int[nums.length];
		 int[] suffixSum = new int[nums.length];
		
		 
		
		return output;
	}
}
