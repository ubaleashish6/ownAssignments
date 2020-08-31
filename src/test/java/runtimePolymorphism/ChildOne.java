package runtimePolymorphism;

public class ChildOne extends ParentOne {
	
	public void methodOne() {
		System.out.println("This method belongs to child class......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentOne objOne=new ChildOne();
		objOne.methodOne();
		
		

	}

}
