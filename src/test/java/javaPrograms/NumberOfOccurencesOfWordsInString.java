package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurencesOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is programming Lang. Java is good Java";
		
		String array[]=str.split(" ");
		Map<String, Integer> map=new HashMap<String, Integer>();
		/*
		 * for(Map.Entry<String, Integer> entry: map.entrySet()) { //Map<String,
		 * Integer> map=new HashMap<String, Integer>(); if(entry.getKey().contains(s)) {
		 * map. } }
		 */
		for(String s: array) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		
		//Print those words which are having more than 1 occurences
		/*
		 * for(Map.Entry<String, Integer> entry: map.entrySet()) {
		 * if(entry.getValue()>1) { System.out.println(entry.getKey() +
		 * "= "+entry.getValue()); } }
		 */
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			
				System.out.println(entry.getKey() + "= "+entry.getValue());
			
		}

	}

}
