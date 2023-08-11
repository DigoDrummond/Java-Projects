package Array;

import Functions.MyIO;

public class first_sum_last {

	public static void main(String[] args) {
		/*
		 * reads N integers and displays on the screen the sum of the first and last,
		 * second and penultimate
		 */
		int n = MyIO.readInt("Array size: ");
		int[] num = new int[n];
		int[] sum = new int[n/2];

		for (int i = 0; i < n; i++)
			num[i] = MyIO.readInt("Number " + (i + 1) + ": ");
		
		for (int i = 0; i < n-1; i++) {
			sum[i/2] = num[i] + num[n-i-1];
		}
		for(int answer : sum)
			System.out.println(answer);
	}

}
