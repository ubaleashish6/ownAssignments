package javaPrograms;

public class CountOfEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countEachChar("abdeeddseeecd");
	}
	public static void countEachChar(String str) {
		int counter[]=new int[256];
		int len=str.length();
		//char[] charArray=
		for(int i=0;i<len;i++) {
			System.out.println(str.charAt(i));
			counter[str.charAt(i)]++;
			System.out.println(counter[str.charAt(i)]);
		}
		char[] array=new char[len];
		for(int i=0;i<len;i++) {
			
			System.out.println(array[i]);
			System.out.println(str.charAt(i));
			array[i]=str.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++) {
				if(str.charAt(i)== array[j]) {
					flag++;
				}
			}
			if(flag==1) {
				System.out.println("Ocurrences of character "+str.charAt(i)+" is : "+counter[str.charAt(i)] );
			}
		}
		
	}

}
