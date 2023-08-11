package files;

import Application.Arq;

public class file {

	public static void main(String[] args) {
		Arq.openWrite("teste.txt");
		
		Arq.println(1);
		Arq.println(3);
		Arq.println('X');
		Arq.println(true);
		Arq.println("Algoritmos");
		Arq.close();
		
	}

}
