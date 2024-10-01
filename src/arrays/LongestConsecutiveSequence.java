package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = check(new int[] {0,3,7,2,5,8,4,6,0,1});  //100,4,200,1,3,2
		System.out.println(res);

	}

	static int check(int[] nums) {

		Set<Integer> intSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

		int max_length = 1;

		for (int i = 0; i<nums.length; i++) {

			if (intSet.contains(nums[i] - 1)) {
				max_length++;
				intSet.remove(nums[i]);
				continue;
			}
			if (intSet.contains(nums[i] + 1)) {
				max_length++;
				intSet.remove(nums[i]);
				continue;
			}
			
		}
		return max_length;

	}
}
