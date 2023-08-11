package Two_dimensional_Array;

import Functions.MyIO;

public class transposed_matrix {

	public static final int L = 4;
	public static final int C = 4;

	public static void main(String[] args) {
		/*
		 * read the elements of an array with L rows and C columns and show on the
		 * screen the elements of the Transposed matrix
		 */

		int[][] array = new int[L][C];

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				array[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}

		System.out.println("Original Array: ");
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				System.out.printf("%d", array[i][j]);
			}
			System.out.printf("\n");// go to the next line
		}
		int[][] invertedArray = new int[C][L];

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				invertedArray[i][j] = array[j][i];
			}
		}
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				System.out.printf("%d", invertedArray[i][j]);
			}
			System.out.printf("\n");// go to the next line
		}
	}

}
