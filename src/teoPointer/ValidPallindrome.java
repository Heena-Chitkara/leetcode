package teoPointer;

public class ValidPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean yes = isPallindrome("A man, a plan, a canal: Panama");
		System.out.println(yes);
	}

	public static boolean isPallindrome(String s) {

		int i = 0;
		int j = s.length() - 1;
		s = s.toLowerCase();
		String nonAlphaRegex = "[^a-z0-9]";
		while (i < j) {
			if (String.valueOf(s.charAt(i)).matches(nonAlphaRegex)) {
				i++;
				continue;
			}
			if (String.valueOf(s.charAt(j)).matches(nonAlphaRegex)) {
				j--;
				continue;
			}
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
				continue;
			}
			return false;
		}
		return true;

	}
}
