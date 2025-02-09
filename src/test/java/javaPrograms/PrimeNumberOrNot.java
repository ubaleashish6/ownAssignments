package javaPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number =");
		int num=in.nextInt();
		int count=0;
		if(num>1) {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					count++;
				}
			}
		}
		if(count==0 && num>1) {
			System.out.println(num +" is a prime number");
		}
		else {
			System.out.println(num +" is not a prime number");
		}

	}

}
