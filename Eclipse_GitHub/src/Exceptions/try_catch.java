package Exceptions;

public class try_catch {

	public static void main(String[] args) {
		
		try {
			int[] array = new int[4];
			System.out.println("Befora exception");
			array[4] = 1;
			System.out.println("This txt not gonna be printed");
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exception while acess index that doesnt exist");
		}
		System.err.println("Printed after exception");
	}

}
