package Array;

import Functions.MyIO;

public class show_highest_and_smallest_number {

	public static final int n = 5;

	public static void main(String[] args) {
		// reads and array of n integers and show the highest
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++)
			numbers[i] = MyIO.readInt("Number " + (i + 1) + ": ");

		int highestNum = highest(numbers, n);
		int smallestNum = smallest(numbers, n);

		System.out.println("Highest number of the array: " + highestNum);
		System.out.println("Smallest number of the array: " + smallestNum);
	}

	public static int highest(int[] numbers, int n) {
		int highestNum = numbers[0];

		for (int i = 1; i < n; i++) {
			if (highestNum < numbers[i])
				highestNum = numbers[i];
		}

		return highestNum;
	}

	public static int smallest(int[] numbers, int n) {
		int smallestNum = numbers[0];

		for (int i = 1; i < n; i++) {
			if (smallestNum > numbers[i])
				smallestNum = numbers[i];
		}

		return smallestNum;
	}

}
