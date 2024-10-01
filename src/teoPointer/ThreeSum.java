package teoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		List<List<Integer>> output = checkThreeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		output.forEach(System.out::println);

	}

	static List<List<Integer>> checkThreeSum(int[] nums) {

		Arrays.sort(nums); // -4,-1,-1,0,1,2
		List<List<Integer>> outputList = new ArrayList<>();
		for (int i = 0; i < nums.length-2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			List<Integer> list = new ArrayList<>();
			while (j <k) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					list = List.of(nums[i], nums[j], nums[j]);
					j++;
					k--;
				} else if (nums[i] + nums[j] + nums[k] < 0) {
					j++;
				} else {
					k--;
				}
			}
			if (!list.isEmpty()) {
				outputList.add(list);
				list.forEach(System.out::println);
			}
		}

		return outputList;

	}

}
