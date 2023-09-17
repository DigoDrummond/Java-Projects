package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("Employee #" + i + 1 + " data:");
			System.out.println("Outsourced (y/n)? ");
			char c = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (c == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
				i++;
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
				i++;
			}

		}
		System.out.println();
		System.out.println("  PAYMENTS ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}

		sc.close();
	}

}
