package string_problems;

public class ReverseString {

	public static void main(String[] args) {
		String input = "ABC";
		System.out.println(reverse(input));
	}

	private static char[] reverse(String input) {
		char in[] = input.toCharArray();

		for (int left = 0, right = in.length - 1; left < right; left++, right--) {
			swap(in, left, right);
		}
		return in;
	}

	private static void swap(char[] in, int left, int right) {
		char temp = in[left];
		in[left] = in[right];
		in[right] = temp;

	}

}
