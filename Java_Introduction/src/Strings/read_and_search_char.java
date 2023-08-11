package Strings;

import Functions.MyIO;

public class read_and_search_char {

	public static void main(String[] args) {
		// Reads a String and a char, show how many times the char appears on the String

		String text = MyIO.readString("Text: ");
		char search = MyIO.readChar("Character to search for: ");
		char[] textChar = text.toCharArray();
		int count = 0;

		for (int i = 0; i < textChar.length; i++) {
			if (textChar[i] == search)
				count++;
		}
		if (count == 0)
			System.out.println("The character doesnt appear on the string");
		else
			System.out.println("The character " + search + " appears " + count + " times on the string " + text);
	}

}
