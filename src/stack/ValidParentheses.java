package stack;
import java.util.*;
public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));

	}
	static boolean isValid(String s) {
		char[] arr  = s.toCharArray();
		if(arr.length<2) return false;
		Map<Character, Character> parenthesesPair = new HashMap<>();
		parenthesesPair.put('(', ')');
		parenthesesPair.put('[', ']');
		parenthesesPair.put('{', '}');
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i< arr.length; i++) {
			if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[') {
				stack.push(arr[i]);
			}
			else if(arr[i] == parenthesesPair.get(stack.peek())){
				stack.pop();
			}
			else return false;
		}
		
		
		return true;
		
	}

}
