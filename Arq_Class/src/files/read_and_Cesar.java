package files;

import Application.Arq;
import Application.MyIO;

public class read_and_Cesar {

	public static final int KEY = 3;
	
	public static void main(String[] args) {
		Arq.openRead(MyIO.readLine("Enter file name: "));
		
		String file1 = Arq.readLine();
		char[] array = file1.toCharArray();
		int size  = file1.length();
		int[] ascii = new int[size];
		
		for(int i =0; i< size; i++) {
			ascii[i] = (int)array[i] + KEY;
		}
		char[] cesarArray = new char[size];
		
		for(int i =0; i < size; i++) {
			cesarArray[i] = (char)ascii[i];
		}
		
		String encryptedText = new String(cesarArray);
		
		Arq.close();
		
		System.out.println("Encrypted text: " + encryptedText);

	}

}
