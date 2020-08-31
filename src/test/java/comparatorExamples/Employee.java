package comparatorExamples;

import java.util.Comparator;

public class Employee {
	
	int empId;
	String empName;
	String city;
	int age;
	public Employee(int empId, String empName, String city, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", age=" + age + "]";
	}
	
}

class SortByEMPid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.empId>o2.empId) {
			return 1;
		}
		else if(o1.empId<o2.empId) {
			return -1;
		}
		return 0;
	}
	
}

class SortByEMPName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
			
		return o2.empName.compareTo(o1.empName);
	}
	
}
