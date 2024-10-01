package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		int element = 3;
		System.out.println(binarySearch(arr, element));
		
		binarySearchRecursive(arr,0,arr.length);
		
		
	}
	
	static boolean binarySearch(int[] arr, int element) {
		int start = 0; 
		int end = arr.length-1;
		int mid = start + end/2;
		while(start<end) {
			if(arr[mid] == element) return 
		}
	}
	
	
	
	static void binarySearchRecursive(int[] arr, int start, int end) {
		
	}
}
