package exercise.oops.burger;

public class HealthyBurger extends Hamburger {

	private String healthyExtra1Name;
	private double healthyExtra1Price;

	private String healthyExtra2Name;
	private double healthyExtra2Price;

	public HealthyBurger(String meat, double price) {

		super("Healthy hamburger", "Brown rye roll", price, meat);
	}

	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
		System.out.println("Added " + name + " for an extra " + price);
	}

	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
		System.out.println("Added " + name + " for an extra " + price);
	}

	@Override
	public double itemizeHamburger() {

		double burgerPrice = super.itemizeHamburger();
		if (this.healthyExtra1Name != null) {
			burgerPrice += this.healthyExtra1Price;
		}
		if (this.healthyExtra2Name != null) {
			burgerPrice += this.healthyExtra2Price;
		}

		return burgerPrice;

	}
}