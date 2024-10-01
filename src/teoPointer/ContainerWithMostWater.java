package teoPointer;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] heights = new int[] {8,7,2,1};

		System.out.println(maxWater(heights));
	}

	static int maxWater(int[] heights) {
		int start = 0;
		int end = heights.length - 1;

		int maxArea = 0;

		while (start <end) {
			maxArea = calculateMaxArea(heights, start, end, maxArea);
			maxArea = calculateMaxArea(heights, start + 1, end, maxArea);
			maxArea = calculateMaxArea(heights, start, end - 1, maxArea);
			start++;
			end--;

		}

		return maxArea;
	}

	static int calculateMaxArea(int[] heights, int start, int end, int maxArea) {

		return Math.max(maxArea, Math.min(heights[start], heights[end]) * (end-1 - start));
	}
}
