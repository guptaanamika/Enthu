package practice.dp;

import java.util.Arrays;

public class LIS {

	public int lis(int a[]) {
		int size = 1;

		int lis[] = new int[a.length];
		Arrays.fill(lis, 1);

		for (int i = 1; i < a.length; i++)
			for (int j = 0; j < i; j++)
				if (a[i] > a[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
					size = size > lis[i] ? size : lis[i];
				}

		System.out.println(lis);
		return size;
	}

	public static void main(String[] args) {
		int a[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		System.out.println(new LIS().lis(a));
	}
}
