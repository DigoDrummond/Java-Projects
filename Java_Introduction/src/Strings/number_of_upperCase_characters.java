package Strings;

import Functions.MyIO;

public class number_of_upperCase_characters {

	public static void main(String[] args) {
		// reads a string, and show the number of characters and upper case characters
		
		String txt = MyIO.readLine("Enter string: ");
		int n = txt.length();//number of characters of the string
		int count = 0; //count the number of upper case characters
		
		for(int i =0; i< txt.length();i++) {
			if((int)txt.charAt(i) >=65 && (int)txt.charAt(i)<=90)
				count++;
		}
		System.out.println("Number of characters: "+ n);
		System.out.println("Number of upper case characters: " + count);
		

	}

}
