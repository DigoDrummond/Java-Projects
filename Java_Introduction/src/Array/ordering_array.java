package Array;

import java.util.Scanner;

public class ordering_array {
	public static final int N = 5;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[N];
		int temp;
		for (int i =0; i < N; i++) {
			System.out.printf("Enter number %d: ", i+1);
			numbers[i] = sc.nextInt();
		}
		//first for gets the element, and second one compares it with the others
		for(int i = 0; i< N; i++) {
			for(int j =0; j< N; j++) {
				//change positions in case i < j
				if(numbers[i] < numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for(int i =0; i< N; i++) {
			System.out.println(numbers[i]);
		}
		
		sc.close();
	}
}
