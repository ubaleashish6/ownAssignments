package javaPrograms;

public class ReverseLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is java program";
		String words[]=str.split(" ");
		String reverseString="";
		for(String word:words) {
			String revString="";
			for(int i=word.length()-1;i>=0;i--) {
				revString=revString+word.charAt(i);
			}
			reverseString=reverseString+revString+" ";
		}
		System.out.println(reverseString);
		
		

	}

}
