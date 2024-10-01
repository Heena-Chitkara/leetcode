package arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram","agramna"));

	}
	
	static boolean isAnagram(String s, String t) {
		Map<String, Long> map1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		
		return true;
		
	}

}
