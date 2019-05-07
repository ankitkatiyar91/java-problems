package string_problems;

import static java.lang.Math.max;

public class LongestCommonSubString {

	public static void main(String[] args) {
		String first = "abcddabcdef";
		String second = "zbcddafabcde";
		System.out.println(lcs(first, second));
		System.out.println(lcsString(first, second));
	}

	protected static String lcsString(String first, String second) {

		int length = 0;
		int m = first.length();
		int n = second.length();
		// Create A matrix for string, left is first string, top is second string
		int[][] mat = new int[m + 1][n + 1];
		int startIndexLeft = 0;
		int startIndexRight = 0;

		// traverse matrix
		for (int i = 1; i <= m; i++) {

			for (int j = 1; j <= n; j++) {
				// if character matches
				if (first.charAt(i - 1) == second.charAt(j - 1)) {
					// increase the value by one of one left one top
					mat[i][j] = mat[i - 1][j - 1] + 1;
					// keep track of max value on the diagonal
					if (mat[i][j] > length) {
						length = mat[i][j];
						startIndexLeft = i;
						startIndexRight = j;
					}

				} else {
					mat[i][j] = 0;
				}
			}
		}

		char chars[] = new char[length];
		int charIndex = length-1;
		while (mat[startIndexLeft][startIndexRight] > 0) {
			chars[charIndex] = first.charAt(startIndexLeft-1);
			startIndexLeft--;
			startIndexRight--;
			charIndex--;
		}

		return String.valueOf(chars);

	}

	protected static int lcs(String first, String second) {
		int length = 0;
		int m = first.length();
		int n = second.length();
		int[][] mat = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {

			for (int j = 1; j <= n; j++) {
				if (first.charAt(i - 1) == second.charAt(j - 1)) {
					mat[i][j] = mat[i - 1][j - 1] + 1;
					length = max(length, mat[i][j]);
				} else {
					mat[i][j] = 0;
				}
			}
		}

		return length;

	}

}
