package runtimePolymorphism;

public class RunTimePolymorphismWithInterface2 implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("This method is from Interface 2 and implemented in RunTimePolymorphismWithInterface2....");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("This method is from Interface 1 and Interface 2 and implemented in RunTimePolymorphismWithInterface2....");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("This method is from Interface 1 and implemented in RunTimePolymorphismWithInterface2....");
	}

}
