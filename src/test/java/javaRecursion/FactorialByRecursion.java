package javaRecursion;

public class FactorialByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFact(4));

	}
	
	public static int getFact(int num) {
		
		if(num==0) {
			return 0;
		}
		else if(num==1) {
			//int fact=num;
			return 1;
		}
		else {
			return (num	*getFact(num-1));
		}
		
	}

}
