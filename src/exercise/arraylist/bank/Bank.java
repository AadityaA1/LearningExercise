package exercise.arraylist.bank;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		branches = new ArrayList<Branch>();
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	private Branch findBranch(String branchName) {
		for (Branch b : branches) {
			if (b.getName().equals(branchName)) {
				return b;
			}
		}
		return null;
	}

	public boolean addCustomer(String branchName, String customerName, double initalTransaction) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, initalTransaction);
		} else {
			Branch newBranch = new Branch(branchName);
			newBranch.newCustomer(customerName, initalTransaction);
			this.branches.add(newBranch);
		}
		return false;
	}

	public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, initialTransaction);
		}
		return false;
	}

	public boolean listCustomers(String branchName, boolean printTransactions) {
		if (findBranch(branchName) != null) {
			Branch foundBranch = findBranch(branchName);
			System.out.println("Customer details for branch " + branchName);
			int position = 1;
			for (Customer c : foundBranch.getCustomers()) {
				System.out.println("Customer: " + c.getName() + "[" + position + "]");
				position++;
				if (printTransactions) {
					System.out.println("Transactions");
					for (int i = 0; i < c.getTransactions().size(); i++) {
						System.out.println("[" + (i + 1) + "]" + " Amount " + c.getTransactions().get(i));
					}
				}
			}
			return true;
		}
		return false;

	}

}
