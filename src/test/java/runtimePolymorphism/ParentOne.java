package runtimePolymorphism;

public class ParentOne {
	
	public void methodOne() {
		System.out.println("This method belongs to parent class......");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentOne objOne=new ChildOne();
		objOne.methodOne();

	}

}
