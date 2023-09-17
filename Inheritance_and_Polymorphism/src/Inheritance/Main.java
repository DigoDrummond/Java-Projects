package Inheritance;


public class Main {

	public static void main(String[] args) {
		Account ac = new Account("Rodrigo",1001, 0.0);
		BusinessAccount bacc = new BusinessAccount("Maria",1002, 0.0, 500.00);

		//UPCASTING
		//pega objeto do tipo BusinessAccount e o atribui para variavel do tipo Account
		//é possivel pois conta empresarial é uma cona(herança)
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount("Bob", 1003, 0.0, 200.0);
		Account acc3 = new SavingsAccount("Ana",1004, 0.0, 0.01);
		
		//DOWNCASTING
		//pega objeto do tipo Account e atribui a BusinessAccount
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;//so da problema quando executa
		//^subclasse com subclasse
		if(acc3 instanceof BusinessAccount) {//acc3 não é instancia de BusinessAccount
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.UpdateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account("Alex", 1006,1000.0);
		acc6.withDraw(200.0);//desconta 5
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount("Override", 1007,1000.0, 0.01 );
		acc7.withDraw(200.0);//não desconta 5, operações diferentes(override)
		System.out.println(acc7.getBalance());
	}

}
