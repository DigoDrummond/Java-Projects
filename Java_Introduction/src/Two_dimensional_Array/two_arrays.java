package Two_dimensional_Array;

import Functions.MyIO;

public class two_arrays {

	public static final int L = 4;
	public static final int C = 4;

	public static void main(String[] args) {
		/* Reads two arrays of dimensions L and C and show the sum of the elements */

		int[][] array = new int[L][C];
		int[][] array2 = new int[L][C];
		int[][] sum = new int[L][C];

		System.out.println("First Array: ");
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				array[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}

		System.out.println("Second Array: ");
		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				array2[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				sum[i][j] = array[i][j] + array2[i][j];
			}
		}
		
		System.out.println("Arrays Sum: ");
		for(int i=0;i<L;i++) {
			for(int j=0;j<C;j++) {
				System.out.printf("%d", sum[i][j]);
			}
			System.out.printf("\n");//go to the next line 
		}
	}

}
