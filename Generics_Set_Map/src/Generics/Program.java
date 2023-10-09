package Generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		try {
			Integer x = ps.first();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("First: " + ps.first());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		sc.close();
	}

}
