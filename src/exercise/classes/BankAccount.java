package exercise.classes;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		// to set default values
		// call to [this] should be first line in constuctor
		// call to the accounts constructor with parameters
		this("A8888", 12000.33, "Default Name", "default@default.com", "default phone");

		System.out.println("Empty Constructor");
	}

	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;

		// best practice - in constructor dont call the setters, instead use as above
		// save field values directly as above
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void depositFunds(double amount) {
		this.balance += amount;
		System.out.println("Account Balance " + this.balance);
	}

	public void withDrawFunds(double amount) {
		if (this.balance - amount >= 0) {
			this.balance -= amount;
			System.out.println("Account Balance " + this.balance);
		} else {
			System.out.println("Insufficient funds -- Unable to withdraw");
			System.out.println("Account Balance " + this.balance);
		}
	}

	public static void main(String[] args) {
		BankAccount axisAccount = new BankAccount();
		axisAccount.depositFunds(100);
		axisAccount.withDrawFunds(99);
		axisAccount.withDrawFunds(1.5);

		BankAccount hdfcAccount = new BankAccount("A763739", 121.99, "John Smith", "johns@s.com", "+988-837-83737");
		hdfcAccount.depositFunds(200);
		hdfcAccount.withDrawFunds(100);

	}

}
