package arrays;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		
		findTwoSumIndexes(new int[] {2,7,8,9}, 9);
	}
	
	static void findTwoSumIndexes(int[] arr , int target){
		
		   Map<Integer, Integer> pairMap = new HashMap<>();
	        int[] arrayToReturn = new int[2];

	        for(int i=0; i<arr.length; i++){
	            int complement = target-arr[i];
	            if(pairMap.containsKey((complement)){
	                arrayToReturn[0] = i;
	                arrayToReturn[1] = pairMap.get(complement);
	                break;
	            }
	            else pairMap.put(arr[i], i);

	        }
	}
}
