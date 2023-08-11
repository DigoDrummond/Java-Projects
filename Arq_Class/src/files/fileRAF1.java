package files;

import Application.Arq;
import java.io.*;

public class fileRAF1 {

	public static void main(String[] args) {
		RandomAcessFile raf = new RandomAcessFile("exemplo.txt", "rw");
		
		raf.writeInt(1);
		raf.writeDouble(5.3);
		raf.writeChar('X');
		raf.writeBoolean(true);
		raf.writeBytes("Algoritmos");
		
		raf.close();
	}

}
