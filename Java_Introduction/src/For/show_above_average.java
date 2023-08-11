package For;

import Functions.MyIO;

public class show_above_average {
	
	public static final int n = 5;

	public static void main(String[] args) {
		// Reads n integers , calculates the average and show those who are above average
		int sum = 0;
		int[] numbers = new int[n];
		for(int i =0; i< n; i++) {
		    numbers[i] = MyIO.readInt("Enter number " + (i+1) + ": ");
			sum += numbers[i];
		}
		double average = sum / n;
		for(int i=0; i< n; i++) {
			if(numbers[i] >= average)
				System.out.println(numbers[i]);
		}
	}

}
