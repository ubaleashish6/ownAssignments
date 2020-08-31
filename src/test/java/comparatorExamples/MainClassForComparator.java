package comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainClassForComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(new Employee(23333, "Ashish U", "Pune", 34));
		empList.add(new Employee(12344, "Nilesh U", "Pune", 34));
		empList.add(new Employee(24454, "Satish U", "Pune", 34));
		empList.add(new Employee(14344, "Ankit U", "Pune", 34));
		empList.add(new Employee(10000, "Sahil U", "Pune", 34));
		empList.add(new Employee(12000, "Sahil U", "Pune", 34));
		
		System.out.println("List by sorting order of emp id");
		Collections.sort(empList, new SortByEMPid());
		Iterator<Employee> empitr=empList.iterator();
		while(empitr.hasNext()) {
			System.out.println(empitr.next());
		}
		
		System.out.println("List by descending order of emp Name");
		Collections.sort(empList, new SortByEMPName());
		Iterator<Employee> empNameitr=empList.iterator();
		while(empNameitr.hasNext()) {
			System.out.println(empNameitr.next());
		}

	}

}
