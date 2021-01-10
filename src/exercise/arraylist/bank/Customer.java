package exercise.arraylist.bank;

import java.util.ArrayList;

public class Customer {

	private ArrayList<Double> transactions;
	private String name;

	public Customer(String name, double initialTransaction) {
		this.name = name;
		transactions = new ArrayList<>();
		this.transactions.add(initialTransaction);

	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public String getName() {
		return name;
	}

	public void addTransaction(double amount) {
		transactions.add(amount);

	}

}
