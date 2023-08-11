package Array;

import Functions.MyIO;

public class show_smallest_element_position {

	public static final int n = 5;
	
	public static void main(String[] args) {
		/* Reads the elements of an array of size n and
		show the position of the smallest element of the array*/
		
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++)
			numbers[i] = MyIO.readInt("Number " + (i + 1) + ": ");
		
		int smallestIdx = smallest(numbers, n);
		
		System.out.println("Smallest number: " + numbers[smallestIdx] + "\nSmallest Idx: " + smallestIdx);
		
	}
	public static int smallest(int[] numbers, int n) {
		int smallest = numbers[0];
		int smallestIdx = 0;
		for(int i = 1; i< n; i++) {
			if(numbers[i] < smallest) {
				smallest = numbers[i];
				smallestIdx = i;
			}	
		}
		
		return smallestIdx;
	}
}
