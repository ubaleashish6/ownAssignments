package javaPrograms;

public class MaxNumberInArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,12,23,455,1,98,11,0,501};
		int maxNum=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>maxNum) {
				maxNum=arr[i];
			}
		}
		System.out.println(maxNum);

	}

}
