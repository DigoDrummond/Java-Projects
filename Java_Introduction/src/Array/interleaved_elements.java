package Array;

import Functions.MyIO;

public class interleaved_elements {

	public static void main(String[] args) {
		//Reads two arrays and display their values interleaved on the screen.
		
		int size1,size2,biggerSize;
		size1 = MyIO.readInt("Size of the first array: ");
		size2 = MyIO.readInt("Size of the second array: ");
		
		biggerSize = size1 + size2;
		
		int[] num1 = new int[size1];
		int[] num2 = new int[size2];
		
		System.out.println("First Array: \n");
		for(int i = 0; i < size1; i++)
			num1[i] = MyIO.readInt("Number  " + (i+1) + ": ");
		
		System.out.println("Second Array: \n");
		for(int i = 0; i< size2; i++)
			num2[i] = MyIO.readInt("Number  " + (i+1) + ": ");
		
		for(int i = 0; i < biggerSize; i++) {
			if(i<size1)
				System.out.println(num1[i]);
			if(i<size2)
				System.out.println(num2[i]);
		}
	}

}
