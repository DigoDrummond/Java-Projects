package Array;

import Functions.MyIO;

public class ordering_array_2 {

	public static final int n = 5;

	public static void main(String[] args) {
		// read an array containing N elements inserted into
		// any order and show the elements in an ordered way

		int[] num = new int[n];
		int temp;

		for (int i = 0; i < n; i++)
			num[i] = MyIO.readInt("Number " + (i + 1) + ": ");

		// first for gets the element, second one compares it with the others
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int ordered : num)
			System.out.println(ordered);

	}

}
