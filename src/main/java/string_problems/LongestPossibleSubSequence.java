package string_problems;

import static java.lang.Math.max;

/*
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
*  LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
*  
*  Ref:https://www.geeksforgeeks.org/printing-longest-common-subsequence/
 */
public class LongestPossibleSubSequence {

	public static void main(String[] args) {
		String first = "ABCDGH";
		String second = "AEDFHR";
		System.out.println(lcsString(first, second));
	}

	protected static String lcsString(String first, String second) {

		int m = first.length();
		int n = second.length();
		// Create A matrix for string, left is first string, top is second string
		int[][] mat = new int[m + 1][n + 1];

		// traverse matrix
		for (int i = 1; i <= m; i++) {

			for (int j = 1; j <= n; j++) {
				// if character matches
				if (first.charAt(i - 1) == second.charAt(j - 1)) {
					// increase the value by one of one left one top
					mat[i][j] = mat[i - 1][j - 1] + 1;
				} else {
					mat[i][j] = max(mat[i - 1][j], mat[i][j - 1]);
				}
			}
		}

		int length = mat[m][n];
		int leftIndex = m, rightIndex = n;
		char chars[] = new char[length];
		int index = length;
		while (leftIndex > 0 && rightIndex > 0) {

			if (first.charAt(leftIndex - 1) == second.charAt(rightIndex - 1)) {
				chars[index - 1] = first.charAt(leftIndex - 1);
				index--;
				leftIndex--;
				rightIndex--;
			} else {
				if (mat[leftIndex - 1][rightIndex] > mat[leftIndex][rightIndex - 1]) {
					leftIndex--;
				} else {
					rightIndex--;
				}
			}

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
				} else {
					mat[i][j] = max(mat[i - 1][j], mat[i][j - 1]);
				}
			}
		}

		length = mat[m][n];

		return length;

	}
}
