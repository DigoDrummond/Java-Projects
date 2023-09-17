package Inheritance;

public class Account {

	private Integer number;
	private String holder;// so pode ser acessado pela mesma classe
	protected Double balance;// pode ser acessado por subclasse

	public Account() {
	}

	public Account(String holder, Integer number, Double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		balance -= amount +5.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}

}
