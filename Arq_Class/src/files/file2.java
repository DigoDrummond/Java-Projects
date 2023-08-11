package files;

import Application.Arq;

public class file2 {

    public static void main(String[] args) {
        Arq.openRead("teste.txt");
        
        int inteiro = Arq.readInt();
        double real = Arq.readDouble();
        char caractere = Arq.readChar();
        boolean boleano = Arq.readBoolean();
        String str = Arq.readString();
        
        Arq.close();
        
        System.out.println(inteiro);
        System.out.println(real);
        System.out.println(caractere);
        System.out.println(boleano);
        System.out.println(str);
    }
}
