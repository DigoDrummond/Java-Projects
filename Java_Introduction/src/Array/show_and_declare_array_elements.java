package Array;

public class show_and_declare_array_elements {

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 8, 2, 8 };

		// removing duplicated numbers
		//after checking if the element is duplicated, if it isn't than its printed

		System.out.println("Array without duplicated numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			boolean repeated = false;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated)
				System.out.println(numbers[i]);
		}
	}
}
