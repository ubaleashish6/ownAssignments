package interivewQuestions;

public class TrainglePatternForStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		for(int i=0;i<=num;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
