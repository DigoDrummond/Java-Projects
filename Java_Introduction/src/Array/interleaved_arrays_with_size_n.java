package Array;

import Functions.MyIO;

public class interleaved_arrays_with_size_n {

	public static final int n = 5;
	
	public static void main(String[] args) {
		//Read two arrays containing N elements each
		//then show the elements in an interleaved way

		int[] array1 = new int[n];
		int[] array2 = new int[n];
		
		System.out.println("First Array: \n");
		for(int i = 0; i < n; i++)
			array1[i] = MyIO.readInt("Number  " + (i+1) + ": ");
		
		System.out.println("Second Array: \n");
		for(int i = 0; i< n; i++)
			array2[i] = MyIO.readInt("Number  " + (i+1) + ": ");
		
		for(int i = 0; i < 2* n; i++) {
			if(i<n)
				System.out.println(array1[i]);
			if(i<n)
				System.out.println(array2[i]);
		}
	}

}
