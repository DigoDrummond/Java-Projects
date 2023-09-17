package Inheritance;

public final class SavingsAccount extends Account {// conta poupança
	//final evita que classe savingsAccount seja herdada por outra classe
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String holder, Integer number, Double balance, Double interestRate) {
		super(holder, number, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void UpdateBalance() {// atualiza saldo com base na taxa de juros
		balance += balance * interestRate;
	}

	@Override //sem taxa de 5 reais
	public void withDraw(double amount) {
		balance -= amount;
	}

}
