package While;

import Functions.MyIO;

public class Max_grades {

	public static final int STUDENTS = 20;
	
	public static void main(String[] args) {
		/*Reads an integer N indicating the maximum grade
		on a P exam. Then read the grade of 20 students (between 0 and N) and
		show on the screen: (i) the class average, (ii) the number of students whose grade was
		lower than the University average (assume 60%) and (iii) the amount of
		students with grade A (more than 90%)*/
		
		int N = MyIO.readInt("Exam value: ");
		int count = 0;
		int sum = 0;
		int countAGrades = 0;
		int belowAverage = 0;
		double average = N * 0.6;
		double studentA = N * 0.9;
		
		while(count < STUDENTS) {
			int grade = MyIO.readInt("Grade " + (count +1) + ": ");
			sum += grade;
			if(grade < average)
				belowAverage++;
			if(grade>= studentA)
				countAGrades++;
			count++;
		}
		double classAverage = sum/STUDENTS;
		
		System.out.println("Average grade: " + classAverage);
		System.out.println("Numbers of students with grades below the average: " + belowAverage);
		System.out.println("Students with A grades: " + countAGrades);
		
		
	}

}
