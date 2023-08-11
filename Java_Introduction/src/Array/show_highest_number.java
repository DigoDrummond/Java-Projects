package Array;

import Functions.MyIO;

public class show_highest_number {
	
	public static final int n = 5;

	public static void main(String[] args) {
		// reads and array of n integers and show the highest
		int[] numbers = new int[n];
		
		for(int i =0; i< n; i++)
			numbers[i] = MyIO.readInt("Number " + (i+1) + ": ");
		
		int highestNum = highest(numbers, n);
		
		System.out.println("Highest number of the array: " + highestNum);
		
	}
	public static int highest(int[] numbers, int n) {
		int highestNum = numbers[0];
		
		for(int i = 0; i < n; i++) {
			if(highestNum < numbers[i])
				highestNum = numbers[i];
		}
		
		return highestNum;
	}

}
