package exercise.oops.burger;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe hamburger", "white roll", 14.54, "Sausage & Bacon");
		// TODO Auto-generated constructor stub
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println(name + " cannot be added");

	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println(name + " cannot be added");

	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println(name + " cannot be added");

	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println(name + " cannot be added");

	}

}
