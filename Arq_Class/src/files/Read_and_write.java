package files;

import Application.Arq;
import java.io.IOException;
import Application.MyIO;

public class Read_and_write {

	public static void main(String[] args) {
		Arq.openWrite(MyIO.readString("Enter file name: "));
		
		String str = MyIO.readString("Enter a phrase: ");
		Arq.print(str);
		
		Arq.close();
	}

}
