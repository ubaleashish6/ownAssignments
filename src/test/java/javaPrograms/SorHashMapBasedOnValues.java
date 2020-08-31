package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SorHashMapBasedOnValues {
	
	
	public static void main(String[] args) {
		Map<Integer, String> employeeIdAndNameMap = new HashMap<Integer, String>();
		employeeIdAndNameMap.put(10034, "Sean");
		employeeIdAndNameMap.put(10033, "KK");
		employeeIdAndNameMap.put(11004, "MARK");
		employeeIdAndNameMap.put(11724, "ANTONY");
		employeeIdAndNameMap.put(12004, "WEST");
		employeeIdAndNameMap.put(13243, "BEAN");
		employeeIdAndNameMap.put(10004, "AK");
		System.out.println("Original Map:::");
		//employeeIdAndNameMap.forEach(k,v) ->System.out.println();
		for(Entry<Integer, String> entry:employeeIdAndNameMap.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		Set<Entry<Integer,String>> entrySet=employeeIdAndNameMap.entrySet();
		List<Entry<Integer,String>> list=new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("Map Sorted based on values:::");
		//employeeIdAndNameMap.forEach(k,v) ->System.out.println();
		for(Entry<Integer, String> entry:employeeIdAndNameMap.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
