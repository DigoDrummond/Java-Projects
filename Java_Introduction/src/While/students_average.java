package While;

import Functions.MyIO;

public class students_average {
	
	public static final int N = 5;
	
	public static void main(String[] args) {
		// Calculate the average grade of N students
		int count = 0;
		double sum = 0;
		while(count < N) {
			double grade = MyIO.readDouble("Enter grade " + (count+1) + ": ");
			sum += grade;
			count ++;
		}
		double average = sum/N;
		System.out.println("Grades average: " + average);
	}

}
