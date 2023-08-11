package Strings;

import Functions.MyIO;

public class first_letter_a {

	public static void main(String[] args) {
		// Read a string and show the first time letter A appears(i)

		String txt = MyIO.readString("Text: ");
		int a;
		boolean appear = false;

		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == 'a' || txt.charAt(i) == 'A') {
				a = i;
				appear = true;
				System.out.println("A letra 'A' aparece pela primeira vez na posição: " + a);
				break;
			}
		}

	}

}
