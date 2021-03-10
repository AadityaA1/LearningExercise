package exercise.sets.stocklist;

public class StockListMain {

	private static StockList stockList = new StockList();

	public static void main(String[] args) {
		StockItem temp = new StockItem("bread", 1.50, 10);
		stockList.addStock(temp);

		temp = new StockItem("cake", 2.50, 20);
		stockList.addStock(temp);

		temp = new StockItem("cake", 2.50, 30);
		stockList.addStock(temp);

		temp = new StockItem("juice", 3.50, 30);
		stockList.addStock(temp);

		temp = new StockItem("chips", 4.50, 40);
		stockList.addStock(temp);

		temp = new StockItem("chicken", 5.50, 50);
		stockList.addStock(temp);

		temp = new StockItem("sausage", 6.50, 60);
		stockList.addStock(temp);

		stockList.sellStock("sausage", 20);

		System.out.println(stockList);

		Basket myBasket = new Basket("MyBasket");
		sellItem(myBasket, "cake", 19);
		sellItem(myBasket, "bread", 10);
		sellItem(myBasket, "bread", 1);

		System.out.println(stockList);

		temp = new StockItem("Pen", 12);
		stockList.Items().put(temp.getName(), temp);

	}

	public static int sellItem(Basket basket, String item, int quantity) {
		StockItem stockItem = stockList.get(item);
		if (stockItem == null) {
			System.out.println("We don't sell " + item);
			return 0;
		}
		if (stockList.sellStock(item, quantity) != 0) {
			basket.addItem(stockItem, quantity);
			return quantity;
		}
		return 0;
	}
}
