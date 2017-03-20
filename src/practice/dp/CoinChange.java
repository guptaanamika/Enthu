package practice.dp;

public class CoinChange {

	public int coinChange(int coin[], int sum) {
		int M[][] = new int[sum + 1][coin.length];

		for (int i = 0; i <= sum; i++)
			for (int j = 0; j < coin.length; j++) {
				if (i == 0) {
					M[i][j] = 1;
					continue;
				}
				// include j
				int x = (i - coin[j] >= 0) ? M[i - coin[j]][j] : 0;

				// /exclude j
				int y = j >= 1 ? M[i][j - 1] : 0;

				M[i][j] = x + y;
			}
		return M[sum][coin.length - 1];
	}

	public static void main(String[] args) {
		System.out.println(new CoinChange().coinChange(new int[] { 1, 2, 3 }, 4));
		System.out.println(new CoinChange().coinChange(new int[] { 2, 5, 3, 6 }, 10));
	}
}
