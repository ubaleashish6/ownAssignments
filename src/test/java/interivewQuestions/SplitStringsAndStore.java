package interivewQuestions;

public class SplitStringsAndStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc,xyz,pqr";

		String array[] = str.split(",");

		String newStrings[] = null;



		for(int i=0;i<array.length;i++){

			newStrings[i]=array[i]; 
		}

		for(int i=0;i<array.length;i++){

			System.out.println(newStrings[i]); 
		}



	}

}
