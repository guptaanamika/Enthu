package practice.dp;

public class LCS {

	public int lcs(String a, String b) {
		int[][] lcs = new int[a.length() + 1][b.length() + 1];

		for (int i = 0; i <= a.length(); i++)
			for (int j = 0; j <= b.length(); j++) {
				if (i == 0 || j == 0)
					lcs[i][j] = 0;
				else if (a.charAt(i - 1) == b.charAt(j - 1))
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				else
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
			}

		return lcs[a.length()][b.length()];
	}

	public static void main(String[] args) {
		String a = "AGGTAB";
		String b = "GXTXAYB";
		System.out.println(new LCS().lcs(a, b));
	}
}
