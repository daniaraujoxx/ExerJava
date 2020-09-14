package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}


	public Account(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public int getNumber() {
		return number;
	}



	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}

	public void deposito(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
		
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
