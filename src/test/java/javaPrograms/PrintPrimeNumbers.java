package javaPrograms;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value upto want to print prime number = ");
		int n = input.nextInt();

		if(n>1) {
			int i, j;
			for (i = 1; i <= n; i++) {
				int count = 0;
				for (j = 2; j <= i/2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0 & i>1) {
					System.out.print(i + " ");
				}
			}
		}

		// printPrimeNumbers(n);

	}

	/*
	 * public static boolean isPrimeNumber(int num) {
	 * 
	 * if (num < 2) { return false; }
	 * 
	 * for (int i = 2; i < num; i++) {
	 * 
	 * if (num % i == 0) { return false; }
	 * 
	 * }
	 * 
	 * return true; } public static void printPrimeNumbers(int num) { for(int
	 * i=1;i<num;i++) { if(isPrimeNumber(i)==true) {
	 * 
	 * System.out.print(i+" "); } } }
	 */

}
