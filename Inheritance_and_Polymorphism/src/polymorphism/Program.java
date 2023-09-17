package polymorphism;

import Inheritance.*;

public class Program {

	public static void main(String[] args) {
		
		Account x = new Account("alex", 1020, 1000.0);
		Account y = new SavingsAccount("Maria",1023,1000.0,0.01);
		
		//mesma operação withdraw, aponta para variaveis do mesmo tipo
		//mas com comportamento diferente, de acordo com o objeto que ela aponta
		x.withDraw(50.0);//saca 50 + taxa
		y.withDraw(50.0);//saca 50 sem taxa
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
