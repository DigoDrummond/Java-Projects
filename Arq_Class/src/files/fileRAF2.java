package files;

import java.io.*;
import Application.Arq;

public class fileRAF2 {

	public static void main(String[] args) {
		RandomAccessFile raf = new RandomAccessFile("exemplo.txt", "rw");
		int inteiro = raf.readInt();
		double real = raf.readDouble();
		char caractere = raf.readChar();
		boolean boleano = raf.readBoolean();
		String str = raf.readLine();
		raf.close();
		System.out.println(inteiro + " " + real + " " + caractere + " " + boleano + " " + str);
	}

}
