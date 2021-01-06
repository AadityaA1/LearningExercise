package exercise.oops.burger;

public class Hamburger {

	private String name;
	private String breadRollType;
	private String meat;
	private double price;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public Hamburger(String name, String breadRollType, double price, String meat) {
		this.name = name;
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.price = price;
		System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
	}

	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
		System.out.println("Added " + name + " for an extra " + price);
	}

	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
		System.out.println("Added " + name + " for an extra " + price);

	}

	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
		System.out.println("Added " + name + " for an extra " + price);

	}

	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
		System.out.println("Added " + name + " for an extra " + price);
	}

	public double itemizeHamburger() {
		double burgerPrice = this.price;
		if (this.addition1Name != null) {
			burgerPrice += this.addition1Price;
		}
		if (this.addition2Name != null) {
			burgerPrice += this.addition2Price;
		}
		if (this.addition3Name != null) {
			burgerPrice += this.addition3Price;
		}
		if (this.addition4Name != null) {
			burgerPrice += this.addition4Price;
		}
		return burgerPrice;

	}

}
