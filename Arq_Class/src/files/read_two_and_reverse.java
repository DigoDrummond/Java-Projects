package files;

import Application.Arq;
import Application.MyIO;

public class read_two_and_reverse {

	public static void main(String[] args) {
		Arq.openRead(MyIO.readString("Enter file name: "));

		String file1 = Arq.readString();
		String reverse = "";
		
		for(int i = file1.length() - 1; i>=0;i--) {
			reverse += file1.charAt(i);
		}

		Arq.close();

		Arq.openWrite("copia.txt");

		Arq.print(reverse);

		Arq.close();
	}

}
