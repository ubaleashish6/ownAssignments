package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach -1=====================================
		String array[]= {"java","cobol","c++","ashish","ragini","java","ashish"};
		/*
		 * for(int i=0;i<array.length;i++) { for(int j=i+1;j<array.length;j++) {
		 * if(array[i].equals(array[j])) { System.out.println(array[i]); }
		 * 
		 * } }
		 */
		
		//Approach -2 -> Using HashSet=====================================
		
		/*
		 * Set<String> set=new HashSet<String>(); for(String value:array) {
		 * if(set.add(value)==false) { System.out.println(value); } }
		 */
		
		//Approach -3 -> Using HashMap=====================================
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(String value:array) {
			Integer count=map.get(value);
			if(count == null) {
				map.put(value, 1);
				
			}
			else {
				map.put(value, ++count);
			}
			
		}
		for(Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
