package Inheritance;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String holder, Integer number, double balance, double loanLimit) {
		super(holder, number, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}
	}

	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);// saque normal;
		balance -= 2.0;//reutiliza código da superclasse
	}

}
