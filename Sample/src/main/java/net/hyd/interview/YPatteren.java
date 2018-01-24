package net.hyd.interview;

import java.util.Scanner;

public class YPatteren {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of rows: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				if (i == j) {
					System.out.print("*");
				} else if (i + j == n + 2 / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
