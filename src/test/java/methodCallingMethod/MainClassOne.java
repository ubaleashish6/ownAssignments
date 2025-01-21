package methodCallingMethod;

public class MainClassOne {
	
	static private int num;
	static private String name;
	
	public MainClassOne() {
		
	}
	public MainClassOne(int num,String name) {
		this.num=num;
		this.name=name;
	}
	public int getNum() {
		return num;
	}
	public static String getName() {
		return name;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static MainClassOne getClassDetails() {
		return new MainClassOne();
	}
	public static String methodString() {
		return "Hard coded String";
	}
	public int methodInt() {
		return 33;
	}

}
