package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfEachCharacterInString2 {

	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  countEachChar("abdeeddseeecd"); }
	 
	
	//=====Approach 1- Using array=================================
	
	  public static void countEachChar(String str) { 
		  int counter[]=new int[256];
		  int len=str.length();
		  for(int i=0;i<len;i++) {
			  counter[str.charAt(i)]++;
		  }
		  char[] array=new char[len];
		  for(int i=0;i<len;i++) {
			  array[i]=str.charAt(i);
			  int flag=0;
			  for(int j=0;j<=i;j++) {
				  if(str.charAt(i)==array[j]) {
					  flag++;
				  }
			  }
			  if(flag==1) {
				  System.out.println("Count of charater "+str.charAt(i)+ " is: "+counter[str.charAt(i)]);
			  }
		  }
	  }
	 
	


}
