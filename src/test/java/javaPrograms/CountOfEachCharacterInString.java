package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountOfEachCharacterInString {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * countEachChar("abdeeddseeecd"); }
	 */
	
	//=====Approach 1- Using array=================================
	/*
	 * public static void countEachChar(String str) { int counter[]=new int[256];
	 * int len=str.length(); //char[] charArray= for(int i=0;i<len;i++) {
	 * System.out.println(str.charAt(i));
	 * System.out.println(counter[str.charAt(i)]); counter[str.charAt(i)]++;
	 * System.out.println(counter[str.charAt(i)]); } char[] array=new char[len];
	 * for(int i=0;i<len;i++) {
	 * 
	 * System.out.println(array[i]); System.out.println(str.charAt(i));
	 * array[i]=str.charAt(i); int flag=0; for(int j=0;j<=i;j++) {
	 * if(str.charAt(i)== array[j]) { flag++; } } if(flag==1) {
	 * System.out.println("Ocurrences of character "+str.charAt(i)+" is : "+counter[
	 * str.charAt(i)] ); } }
	 * 
	 * }
	 */
	
	//=====Approach 1 - Using Collection==================================
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcddd dfdfd dfdfd tre";
		char[] charArray=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(char c: charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		for(Entry<Character, Integer> entMap: charMap.entrySet()) {
			System.out.println(entMap.getKey()+": "+entMap.getValue());
		}
		
	} */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcddd dfdfd dfdfd tre";
		char[] charArray=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		System.out.println("Map before sorting.............");
		for(char c: charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		printMap(charMap);
		List<Map.Entry<Character, Integer>> sList=new ArrayList(charMap.entrySet());
		Collections.sort(sList, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println("Map after sorting.............");
		Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> entry : sList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        printMap(sortedMap);
	}
	public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}
