package exercise.arraylist.bank;

import java.util.ArrayList;

public class Branch {

	private ArrayList<Customer> customers;
	private String name;

	public Branch(String name) {
		this.name = name;
		customers = new ArrayList<>();
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public String getName() {
		return name;
	}

	public boolean newCustomer(String name, double initialTransaction) {
		if (findCustomer(name) == null) {
			customers.add(new Customer(name, initialTransaction));
			return true;
		}
		return false;
	}

	public boolean addCustomerTransaction(String name, double transaction) {
		if (findCustomer(name) != null) {
			findCustomer(name).addTransaction(transaction);
			return true;
		}
		return false;

	}

	private Customer findCustomer(String name) {
		for (Customer c : customers) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;

	}
}
