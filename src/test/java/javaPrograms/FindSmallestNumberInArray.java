package javaPrograms;

public class FindSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,12,23,455,1,98,11,0};
		int smallestNum=arr[0];
		
		for (int i=1;i<arr.length;i++) {
			//for(int j=i+1;j<arr.length;j++) {
				
				/*
				 * if(arr[i]<arr[j]) {
				 * 
				 * smallestNum=arr[i]; } else { smallestNum=arr[j]; }
				 */
			//}
			if(arr[i]<smallestNum) {
				smallestNum=arr[i];
			}
		}
		System.out.println(smallestNum);

	}

}
