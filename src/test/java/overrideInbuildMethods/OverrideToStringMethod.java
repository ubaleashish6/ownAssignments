package overrideInbuildMethods;

public class OverrideToStringMethod {
	
	int empId;
	String empName;
	
	public OverrideToStringMethod(int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EMP ID: "+empId+",Emploe Name: "+empName;
	}

}
