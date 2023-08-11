package Two_dimensional_Array;

import Functions.MyIO;

public class each_column_average {

	public static final int N = 4;

	public static void main(String[] args) {
		// read an array[N][N] and show the average of each column elements

		int[][] array = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}

		for (int j = 0; j < N; j++) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += array[i][j];
			}
			double average = (double) sum / N;
			System.out.println("Average of column " + (j+1) + ": " + average);
		}

	}

}
