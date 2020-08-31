package javaPrograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfOccurenceOfCharactersAndDescendingSort implements Comparator<Character> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abdfdfd cdfdfdf dfdfdfd gg";
		String newStr=str.replaceAll(" ", "");
		Map<Character, Integer> charCount=new HashMap<Character, Integer>();
		char array[]=newStr.toCharArray();
		for(char ch: array) {
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}
			else {
				charCount.put(ch, 1);
			}
		}
		Set<Character> charSet=charCount.keySet();
		for(Character ch:charSet) {
			System.out.println(ch+"="+charCount.get(ch));
		}

	}

	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
