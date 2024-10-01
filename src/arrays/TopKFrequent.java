package arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequent {
	
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,3,4,2,1,1,4,4,4};
		
		int k=3;
		
		Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map.entrySet().stream().sorted(Map.Entry.<Integer, Long> comparingByValue().reversed()).limit(k).forEach(entry -> System.out.println(entry.getKey()));
		
		
		
		
		
		
		
		
	}

}
