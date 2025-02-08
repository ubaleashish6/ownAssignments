package javaConcepts;

public class FinalVariable {
	
	private final int a;
	
	private FinalVariable(int a) {
		this.a=a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable var=new FinalVariable(10);

	}

}
