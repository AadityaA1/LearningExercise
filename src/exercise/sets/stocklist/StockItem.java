package exercise.sets.stocklist;

public class StockItem implements Comparable<StockItem> {

	private final String name;
	private double price;
	private int initialStockQuantity;

	public StockItem(String name, double price, int initialStockQuantity) {
		this.name = name;
		this.price = price;
		this.initialStockQuantity = initialStockQuantity;
	}

	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.initialStockQuantity = 0;
	}

	public void setPrice(double price) {
		if (price > 0.0)
			this.price = price;
	}

	public void adjustStockQuantity(int quantity) {
		int newQuantity = this.initialStockQuantity + quantity;
		if (newQuantity >= 0) {
			this.initialStockQuantity = newQuantity;
		}

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getInitialStockQuantity() {
		return initialStockQuantity;
	}

	@Override
	public int compareTo(StockItem o) {
		System.out.println("Entering compareTo.....");
		return this.name.compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		System.out.println("Entering hashCode.....");
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering equals.....");

		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		return this.name == ((StockItem) obj).getName();

	}

}
