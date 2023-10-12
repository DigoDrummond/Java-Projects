package HashCode_Equals;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "alex@gmail.com");
		Client c4 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));//se equals fosse so por nome seria verdadeiro
		System.out.println(c1.equals(c4));//verdadeiro pois equals compara nome e email
		
		System.out.println(c1 == c2);//compara as referencias de memória, não conteúdo, possuem endereço de memória diferentes
	}

}
