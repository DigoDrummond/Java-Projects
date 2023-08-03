import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.printf("How many numbers you're gonna use? ");
		size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.printf("Enter number %d: ", i+1);
			numbers[i] = sc.nextInt();
		}
		int choice;
		do {
		System.out.printf("\n<-- Menu -->\n");
		System.out.printf("1-Add numbers.\n2-Subtract numbers.\n3-Multiply numbers.\n4-Divide numbers.\n5-Close program.");
		System.out.printf("Please choose an option: ");
		choice = sc.nextInt();
		int result;
		switch(choice) {
		case 1:
			result = plus(numbers, size);
			System.out.printf("Result: %d\n", result);
			break;
		
		case 2:
			result = minus(numbers, size);
			System.out.printf("Result: %d\n", result);
			break;
		case 3:
			result = multiplication(numbers, size);
			System.out.printf("Result: %d\n", result);
			break;
		case 4:
			result = (int)division(numbers, size);
			System.out.printf("Result: %d\n", result);
			break;
		case 5:
			System.out.printf("Closing program!");
			break;
		default:
			System.out.printf("Invalid choice!");
			break;
		}
		}while(choice!= 5);
		sc.close();
	}
	public static int plus(int[] numbers, int size) {
		int result = 0;
		for(int i = 0; i < size; i++)
			result += numbers[i];
		return result;
	}
	public static int minus(int[] numbers, int size) {
		int result = numbers[0];
		for(int i = 1; i < size; i++)
			result -= numbers[i];
		return result;
	}
	public static int multiplication(int[] numbers, int size) {
		int result = 1;
		for(int i = 0; i < size; i++)
			result *= numbers[i];
		return result;
	}
	public static double division(int[] numbers, int size) {
		double result = numbers[0];
		for(int i = 0; i < size; i++)
			if(numbers[i] != 0)
				result /= numbers[i];
			else {
				System.out.print("Division by 0!\n");
				return 0;
			}	
		return result;
	}

}
