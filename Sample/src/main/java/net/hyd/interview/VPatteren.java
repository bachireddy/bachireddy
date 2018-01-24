package net.hyd.interview;

import java.util.Scanner;

public class VPatteren {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of rows: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n + 1 / 2; i++) {
			for (int j = 1; j <= n + 1 / 2; j++) {
				if (i == j) {
					System.out.print("*");
				} else if (j  == n + 1 / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
