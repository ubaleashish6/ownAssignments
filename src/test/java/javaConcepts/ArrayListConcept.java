package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> intList= new ArrayList<>();
		intList.add(2);
		intList.add(34);
		intList.add(23);
		intList.add(1);
		intList.add(0);
		System.out.println("First List: "+intList);
		intList.add(2, 89);
		System.out.println(intList);
		
		ArrayList<Integer> secondList=new ArrayList<Integer>();
		
		secondList.addAll(intList);
		System.out.println("Second List: "+secondList);
		
		ArrayList<Integer> clonedList=(ArrayList<Integer>) secondList.clone();
		System.out.println("Cloned List: "+clonedList);
		
		if(clonedList.contains(2)) {
			System.out.println("clonedList arraylist contains 2..");
		}
		
		if(clonedList.containsAll(secondList)) {
			System.out.println("secondList all elements are present in clonedList arraylist..");
		}
		System.out.println("Hashcode: " +clonedList.hashCode());
		
		System.out.println(clonedList.indexOf(34));
		Collections.sort(clonedList);
		System.out.println("Sorted List: "+clonedList);
		Iterator<Integer> it = clonedList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
		}
	}

}
