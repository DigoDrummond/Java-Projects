package files;

import Application.MyIO;
import Application.Arq;

public class Read_two_files {

	public static void main(String[] args) {
		Arq.openRead(MyIO.readString("Enter file name: "));
		
		String file1 = Arq.readString();
		
		Arq.close();
		
		Arq.openWrite("copia.txt");
		
		Arq.print(file1);
		
		Arq.close();
		

	}

}
