package Two_dimensional_Array;

import Functions.MyIO;

public class show_diagonals {

	public static final int N = 4;

	public static void main(String[] args) {
		// Read a N dimensions array and show the main and the second diagonal

		int[][] array = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}

		System.out.println("Main diagonal");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j)
					System.out.printf("%d", array[i][j]);
				else {
					System.out.printf("0");
				}
			}
			System.out.printf("\n");
		}
		
		
		System.out.println("Secondary Diagonal: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i + j == N - 1)
					System.out.printf("%d", array[i][j]);
				else {
					System.out.printf("0");
				}
			}
			System.out.printf("\n");
		}

	}

}
