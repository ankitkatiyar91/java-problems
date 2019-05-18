package string_problems;

public class PalindromeExample {

	public static void main(String[] args) {

		System.out.println("Ankit is Palindrome: " + isPalindrome("Ankit"));
		System.out.println("ABA is Palindrome: " + isPalindrome("ABA"));
		System.out.println("ABBA is Palindrome: " + isPalindrome("ABBA"));

	}

	/**
	 * Matching characters of the String from both the ends. 0 will match with
	 * (length-1) 1 will match with (length-2)
	 * 
	 * and so on, until reach the mid of the string.
	 * 
	 * @param input
	 * @return
	 */
	private static boolean isPalindrome(String input) {
		char[] inChars = input.toCharArray();

		for (int i = 0, j = inChars.length - 1; i < j; i++, j--) {
			if (inChars[i] != inChars[j]) {
				return false;
			}

		}

		return true;
	}

}
