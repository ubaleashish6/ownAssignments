package methodCallingMethod;

public class OtherMainClassOne {
	
	static MainClassOne obj;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj=new MainClassOne();
		
		/*
		 * obj=MainClassOne.getClassDetails(); obj.setNum(12);
		 * obj.setName("Ashish Ubale");
		 */
		//obj=new MainClassOne(21, "Ashish Ubale");
		/*
		 * System.out.println(obj.getNum()); System.out.println(obj.getName());
		 */
		
		//System.out.println(obj.methodString().get);

	}

}
