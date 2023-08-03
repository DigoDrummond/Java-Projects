
public class Main {

	public static void main(String[] args) {
		String original = "abcde ABCD ABC abc ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);//recorta string a partir do 2
		String s05 = original.replace('a', 'x');//troca a por x 
		int i = original.indexOf("bc");//pega valor da posição do item, nesse caso 1
		String s = "potato apple lemon";
		String[] vect = s.split(" ");//separa elementos com espaço entre e armazena em vetor
		
		
		
		System.out.printf("Original: %s\n", original);
		System.out.printf("toLowerCase: %s\n", s01);
		System.out.printf("toUpperCase: %s\n", s02);
		System.out.printf("Trim: %s\n", s03);
		System.out.printf("Substring: %s\n", s04);
		System.out.printf("Replace: %s\n", s05);
		System.out.printf("IndexOf 'bc': %d\n", i);
		System.out.printf("Texto Junto: %s\n",s);
		System.out.println(vect[0]);//imprime primeiro elemento do vetor
	}

}
