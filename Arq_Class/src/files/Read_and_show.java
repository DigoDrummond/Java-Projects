package files;

import Application.Arq;
import Application.MyIO;

public class Read_and_show {

	public static void main(String[] args) {
		Arq.openRead(MyIO.readString("Enter file name: "));
	
		String text = Arq.readString();

		Arq.close();
		
		System.out.println(text);
	}

}
