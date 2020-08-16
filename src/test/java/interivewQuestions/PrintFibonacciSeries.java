package interivewQuestions;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//====Approach 1 ->Without recursion
		/*
		 * int num=1000; int a=0,b=1; if(a==0 && b==1) { System.out.print(b+" "); }
		 * for(int i=0;i<20;i++) { int sum=a+b; a=b; b=sum; if(sum<1000) {
		 * System.out.print(sum+" "); } }
		 */
		
		
		//====Approach 2->With recursion
		
		System.out.print(1+" ");
		printFibonacciSeries(0,1);

	}
	public static void printFibonacciSeries(int a, int b) {
		
		
		int sum=a+b;
		if(sum<1000) {
			System.out.print(sum+" ");
			a=b;
			b=sum;
			printFibonacciSeries(a,b);
		}
		//printFibonacciSeries(a,b);
	}

}
