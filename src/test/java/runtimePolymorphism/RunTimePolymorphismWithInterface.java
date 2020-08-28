package runtimePolymorphism;

public class RunTimePolymorphismWithInterface implements InterfaceOne, InterfaceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceOne objOne=new RunTimePolymorphismWithInterface();
		InterfaceTwo objTwo=new RunTimePolymorphismWithInterface();
		InterfaceOne objThree=new RunTimePolymorphismWithInterface2();
		InterfaceTwo objFour=new RunTimePolymorphismWithInterface2();
		
		objOne.methodOne();
		objOne.methodTwo();
		//objTwo.methodOne();
		objTwo.methodThree();
		objThree.methodOne();
		objThree.methodTwo();
		objFour.methodThree();

	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("This method is from Interface 2 implemented in RunTimePolymorphismWithInterface....");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("This method is from Interface 1 and Interface 2 implemented in RunTimePolymorphismWithInterface....");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("This method is from Interface 1 implemented in RunTimePolymorphismWithInterface....");
	}

}
