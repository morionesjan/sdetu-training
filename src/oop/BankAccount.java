package oop;

public class BankAccount {

	String accountNumber;
	private static final String routingNumber = "013546";
	String name;
	private String ssn;
	String accountType;
	double balance;
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) { 
			Msg = "ERROR: Minimum deposit must be at least $1000";
		} else {
			Msg = "Thanks for your initial dposit of: $" + initDeposit;
		}
		
		System.out.println(Msg);
		balance = initDeposit;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { 
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}

	
	void withdraw(double amount) { 
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT#" + accountNumber + ". ROUTING#" + routingNumber + ". BALANCE: $" + balance + " ]";
		
	}
}
