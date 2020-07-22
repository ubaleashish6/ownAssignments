package javaPrograms;

public class SwapTwoWordsWithoutUsingTempVariable {
	
	public static void main(String[] args) {
		String str1="Hello";
		String str2="World";
		System.out.println("String str1= "+str1);
		System.out.println("String str2= "+str2);
		str1=str1+str2; //HelloWorld
		//System.out.println(str1.length());
		//System.out.println(str1.length()-str2.length());
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("================");
		System.out.println("String str1= "+str1);
		System.out.println("String str2= "+str2);
		
	}

}
