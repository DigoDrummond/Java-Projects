package files;

import Application.Arq;
import Application.MyIO;

public class Read_and_toUpperCase {

	public static void main(String[] args) {
		Arq.openRead(MyIO.readString("Enter file name: "));
		
		String upperCase = Arq.readString();
		upperCase = upperCase.toUpperCase();
		
		Arq.close();
		
		System.out.println(upperCase);

	}

}
