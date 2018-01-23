package net.hyd.interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.print("how many prime number's: ");
		int n = sc.nextInt();

		sc.close();

		for (int i = 1; i < n; i++) {
			int counter = 0;
			for (int j = i; j > 0 ; j--) {
				if(i%j==0){
					counter = counter + 1;
				}
			}
			if(counter==2){
				builder.append(" "+ i);
			}
		}
		System.out.println(builder);

	}

}
