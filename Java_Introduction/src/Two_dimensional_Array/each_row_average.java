package Two_dimensional_Array;

import Functions.MyIO;

public class each_row_average {

	public static final int N = 4;

	public static void main(String[] args) {
		// read an array[N][N] and show the average of each row elements

		int[][] array = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}
		
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {
				sum+= array[i][j];
			}
			double average = (double) sum / N;
			System.out.println("Average of row " + (i+1) + ": " + average);
		}
	}

}
