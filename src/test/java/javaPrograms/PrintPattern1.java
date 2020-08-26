package javaPrograms;

public class PrintPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for(int i=1;i<8;i++) { for(int j=0;j<=i/2;j++) { if((i%2)!=0) {
		 * System.out.print(i); } } System.out.println(); }
		 */
		
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				/*
				 * if((i%2)!=0) { System.out.print(i); }
				 */
				System.out.print(i*2-1);
			}
			System.out.println();
		}


	}

}
