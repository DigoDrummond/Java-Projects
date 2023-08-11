package Array;

import Functions.MyIO;

public class sum_of_numbers {
	
	public static final int n = 5;

	public static void main(String[] args) {
		/*Reads n numbers and prints the sum of the i-th and the
		(2*i+1)th term until (2*i+1) < n*/
		
		int[] numbers = new int[n];
		int[] sum = new int[n];
		
		for(int i =0; i< n; i++)
			numbers[i] = MyIO.readInt("Enter number " + (i + 1) + ": ");
		
		for(int i =0;(2*i+1)< n; i++) {
			sum[i] = numbers[i] + numbers[2*i+1];
		}
		
		System.out.println("Sum of pairs: \n");
		for(int num : sum)
			System.out.println(num);
	}

}
