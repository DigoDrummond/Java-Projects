package Array;

import Functions.MyIO;

public class grades_average_sum_and_smallest {

	public static final int n = 5;

	public static void main(String[] args) {
		/*Read the grade of five students, calculate and show:
		sum and average of them and the lowest score*/
		
		int[] grades = new int[n];
		double sum = 0;
		
		for(int i =0;i<n;i++) {
			grades[i] = MyIO.readInt("Enter grade: ");
			sum +=grades[i];
		}
		
		int smallestGrade = smallest(grades,n);
		
		System.out.println("Grades sum: " + sum);
		System.out.println("Average: " + sum / n);
		System.out.println("Worst grade: " + smallestGrade);
		
	}

	public static int smallest(int[] grades, int n) {
		int smallestNum = grades[0];

		for (int i = 1; i < n; i++) {
			if (smallestNum > grades[i])
				smallestNum = grades[i];
		}

		return smallestNum;
	}

}
