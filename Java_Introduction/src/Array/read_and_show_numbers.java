package Array;

import Functions.MyIO;

public class read_and_show_numbers {

	public static final int n = 4;
	
	public static void main(String[] args) {
		// Reads n numbers and show on the screen
		
		int[] numbers = new int[n];
		for(int i =0; i<n;i++)
			numbers[i] = MyIO.readInt("Enter number: ");
		for(int num : numbers)
			System.out.println(num);
	}
		
}
