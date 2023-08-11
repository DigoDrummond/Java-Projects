package Strings;

import Functions.MyIO;

public class if_only_by_digits {

	public static void main(String[] args) {
		// Reads a string and shows if its composed only of digits

		String text = MyIO.readString("Text: ");
		boolean res = true;

		for (int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) >= '0' && text.charAt(i) <= '9') == false) {// verify if its not a digit
				res = false;
				i = text.length();
			}
		}
		if (res == true)
			System.out.println("Congratulations");
		else
			System.out.println("Not a number");

	}

}
