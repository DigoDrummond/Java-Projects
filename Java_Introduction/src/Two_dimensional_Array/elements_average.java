package Two_dimensional_Array;

import Functions.MyIO;

public class elements_average {

	public static final int N = 4;
	
	public static void main(String[] args) {
		//Read the elements of an array[][] and show the average of them
	
		int[][] array = new int[N][N];
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = MyIO.readInt("Enter number [" + (i + 1) + "][" + (j + 1) + "]: ");
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sum+= array[i][j];
			}
		}
		System.out.println("Average: " + sum / Math.pow(N, 2)  );
		
	}

}
