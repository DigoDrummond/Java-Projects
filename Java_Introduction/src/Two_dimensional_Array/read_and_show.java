package Two_dimensional_Array;

import Functions.MyIO;

public class read_and_show {
	
	public static final int L = 4;
	public static final int C = 4;

	public static void main(String[] args) {
		/* read the elements of an array with L rows and C
		columns and show the elements on the screen in grid format*/
		
		int[][] matrix = new int[L][C];
		
		for(int i=0;i<L;i++) {
			for(int j=0;j<C;j++) {
				matrix[i][j] = MyIO.readInt("Enter number ["+ (i+1) + "][" + (j+1)+"]: ");
			}
		}
		
		for(int i=0;i<L;i++) {
			for(int j=0;j<C;j++) {
				System.out.printf("%d", matrix[i][j]);
			}
			System.out.printf("\n");//go to the next line 
		}
	}

}
