package Strings;

import Functions.MyIO;

public class check_if_its_palindrome {

	public static void main(String[] args) {
		// checks if a string is a palindrome

		String text = MyIO.readString("Text: "); // "ROMA E AMOR”, “ABCDDCBA”, “ABXDDCBA”
		boolean resp = true;

		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				resp = false;
				i = text.length();
			}
		}
		if (resp)
			System.out.println("Its a palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
