package exercise.oops.burger;

public class Main {

	public static void main(String[] args) {
		Hamburger hamBurger = new Hamburger("Basic", "Sausage", 3.56, "White");
		hamBurger.addHamburgerAddition1("Tomato", 0.27);
		hamBurger.addHamburgerAddition2("Lettuce", 0.75);
		hamBurger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Buger price is " + hamBurger.itemizeHamburger());

		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addHealthyAddition1("Lentils", 3.41);
		System.out.println("Total Buger price is " + healthyBurger.itemizeHamburger());

		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Dont add", 33.22);
		System.out.println("Total Price is " + db.itemizeHamburger());
	}
}
