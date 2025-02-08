package javaPrograms;

public class FindPrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=6;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					//System.out.println(num+ " is not a prime number");
					count++;
				}
			}
			if(count==2) {
				System.out.println(num+ " is a prime number");
			}
			else {
				System.out.println(num+ " is not a prime number");
			}
		}
		else {
			System.out.println(num+ " is not a prime number");
		}

	}

}
