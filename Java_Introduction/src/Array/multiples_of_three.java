package Array;

import Functions.MyIO;

public class multiples_of_three {

	public static void main(String[] args) {
		// reads N integers and displays the sum
		//of those that are multiples of three

		int n = MyIO.readInt("Array size: ");
		int[] num = new int[n];

		for (int i = 0; i < n; i++)
			num[i] = MyIO.readInt("Number " + (i + 1) + ": ");
		
		System.out.println("Multiples of 3: \n");
		for(int i =0; i < n;i++) {
			if(num[i] % 3 == 0)
				System.out.println(num[i]);
		}
	}

}
