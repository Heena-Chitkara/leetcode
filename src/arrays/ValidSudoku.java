package arrays;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] board = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' }

		};
		
		
		boolean is = isValidSudoku(board);
		System.out.println(is);
		

	}
	
	static boolean isValidSudoku(char[][] board) {
		
		for(int i=0;i<board.length-1;i++) {
			
			if(isDuplicate(board[i])) return false;
			
			
		}
		
		
		
		
		return false;
		
		
		
	}
	
	static boolean isDuplicate(char[] arr) {
		Optional<Entry<String,Long>> op = Arrays.stream(arr.toString().replaceAll(".", "").split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(entry -> entry.getValue()>1L).findAny();
		if(op.isPresent()) return false;
		
		
		
		
		return false;
		
		
	}

}
