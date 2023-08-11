package Strings;

import Functions.MyIO;

public class string_to_int {

	public static void main(String[] args) {
		// Reads a string and turns int integer

		String text = MyIO.readString("Text: ");
		int num = 0;//gets number
		int tmp;//temporary variable to make calculations
		
		for (int i = 0; i < text.length(); i++) {
			tmp = (int) (text.charAt(i) - 48);//converts char into number subtracting 48
			//puts the digit on corretc place, considering his order
			tmp *= (int) Math.pow(10, text.length() - i - 1);
			//puts temp value into variable num, acumulanting the value
			num += tmp;
		}
		
		System.out.println(num);

	}

}
