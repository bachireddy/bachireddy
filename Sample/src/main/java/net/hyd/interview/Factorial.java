package net.hyd.interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to calcualte the fatorial: ");
		int fact = 1, n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + n + " is : " + fact);

	}

}
