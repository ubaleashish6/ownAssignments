
package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//===Approch One===================
		int num =456788;
		int revNum=0;
		while(num>0) {
			revNum=revNum*10+num%10;
			num = num/10;
			
		}
		System.out.println(revNum);

	}

}
