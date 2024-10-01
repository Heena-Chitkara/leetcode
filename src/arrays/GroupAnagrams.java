package arrays;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		//sorting
				Map<String,List<String>> map = new HashMap<>();
				for(String str : strs){
					char[] arr = str.toCharArray();
				Arrays.sort(arr);
				
				String sortedString = new String(arr);
				if(map.get(sortedString)!=null){
					List<String> list = map.get(sortedString);
					list.add(str);
					map.put(sortedString, list);
					}
					
					else {
						List<String> list =	new LinkedList<String>();
					list.add(str);
					map.put(sortedString, list);
					}
				
				}
				
				
				System.out.println(map.values());
				
				//map.entrySet().forEach(entry -> System.out.println(entry.getValue()));
		
		

	}

}
