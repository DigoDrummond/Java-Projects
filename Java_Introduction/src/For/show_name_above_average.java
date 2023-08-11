package For;

import Functions.MyIO;

public class show_name_above_average {
	
	public static final int n = 5;

	public static void main(String[] args) {
		// Reads the grades of n students and show the names of those above average.
		double[] grades = new double[n];
		String[] names = new String[n];
		double sum = 0;
		
		for(int i = 0; i< n; i++) {
			names[i] = MyIO.readLine("Enter name " + (i+1) + ": ");
			grades[i] = MyIO.readDouble("Enter grade " + (i+1) + ": ");
			sum += grades[i];
		}
		double average = sum / n;
		
		for(int i =0; i< n; i++) {
			if(grades[i] >= average)
				System.out.println(names[i]);
		}

	}

}
