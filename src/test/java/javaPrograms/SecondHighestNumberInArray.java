package javaPrograms;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 12, 42, 53, 53, 66, -34, 99, 1200, 10 };
		int largest = array[0];
		int secondLargest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			}

			else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}

		}
		System.out.println("Largest number: " + largest);
		System.out.println("Second Largest number: " + secondLargest);

	}

}
