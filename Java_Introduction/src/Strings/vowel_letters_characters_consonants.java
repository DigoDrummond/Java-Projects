package Strings;

import Functions.MyIO;

public class vowel_letters_characters_consonants {

	public static void main(String[] args) {
		// show the numbers
		// of characters, letters, non-letters, vowels and consonants.

		String txt = MyIO.readString("Text: ");
		int vowel = 0;
		int numbers = 0;
		int letters = 0;
		int nonLetters = 0;
		int consonants = 0;

		for (int i = 0; i < txt.length(); i++) {
			char c = txt.charAt(i);

			if (Character.isLetter(c)) {
				letters++;
				if (isVowel(c))
					vowel++;
				else
					consonants++;
			} else
				nonLetters++;
		}
		System.out.println("Characters: " + txt.length());
		System.out.println("Letters: " + letters);
		System.out.println("Non-letters: " + nonLetters);
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonants);

	}

	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
