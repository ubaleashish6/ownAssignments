package javaPrograms;

public class ReplaceDoubleSpaceToSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My  name  is  Tom";
		String newStr = str.replaceAll("[ ]+", " ");
		System.out.println(newStr);

	}

}
