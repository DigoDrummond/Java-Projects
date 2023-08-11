package For;

import Functions.MyIO;

public class show_grades_average {
	
	public static final int STUDENTS = 5;//number of students
	public static final int N = 10;//test value

	public static void main(String[] args) {
		//Reads the grades of 5 students and show the average of the 
	    //grades who are above or equal to 80%
		int[] grades = new int[STUDENTS];
		int value = 10;
		double belowAverage = N * 0.8;
		int sum = 0;
		int aboveStudents = 0;
		for(int i = 0; i< STUDENTS; i++) {
			grades[i] = MyIO.readInt("Enter grade " + (i+1) + ": ");
			if(grades[i]>= belowAverage) {
				sum += grades[i];
				aboveStudents++;
			}
			
		}
		double average = sum / aboveStudents;
		
		System.out.println("Average: " + average);
	}

}
