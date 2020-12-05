package javaPrograms;

import java.util.Scanner;

public class SmallestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=scan.nextLine();
		String[] words=str.split(" ");
		int shortestWordLength=words[0].length();
		int location=0;
		for(int i=1;i<words.length;i++) {
			if(words[i].length()<shortestWordLength) {
				shortestWordLength=words[i].length();
				location=i;
			}
		}
		System.out.println("Shorted word is: "+words[location]);

	}

}
