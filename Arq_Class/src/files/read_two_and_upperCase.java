package files;

import Application.Arq;
import Application.MyIO;

public class read_two_and_upperCase {

	public static void main(String[] args) {
		Arq.openRead(MyIO.readString("Enter file name: "));

		String file1 = Arq.readString();
		
		file1 = file1.toUpperCase();

		Arq.close();
		
		System.out.println(file1);

		Arq.openWrite("copia.txt");

		Arq.print(file1);

		Arq.close();

	}

}
