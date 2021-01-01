package exercise.classes;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String email;

	public VipCustomer() {
		this("John Louis", 40000.00, "john.louis@next.com");
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "john.louis@nextDefault.com");

	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

	public static void main(String[] args) {
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());

		VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
		System.out.println(customer2.getName());

		VipCustomer customer3 = new VipCustomer("Tim", 15000.00, "tim@next.com");
		System.out.println(customer3.getName());
		System.out.println(customer3.getEmail());

	}

}
