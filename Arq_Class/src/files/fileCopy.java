package files;

import Application.Arq;

public class fileCopy {

	public static void main(String[] args) {
		Arq.openRead("teste.txt");
		
		String str = Arq.readAll();
		
		
		Arq.close();
		
		Arq.openWrite("copia.txt");
		Arq.print(str);
		Arq.close();
	}

}
