package net.hyd.interview;

public class FibanocciSeries {

	public static void main(String[] args) {
		int temp = 0, j = 0, k = 1, n = 10;

		System.out.print(j + " " + k);

		for (int i = 1; i <= n; i++) {
			temp = j + k;
			System.out.print(" " + temp);
			j = k;
			k = temp;
		}

	}

}
