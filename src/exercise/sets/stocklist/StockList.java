package exercise.sets.stocklist;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

	private final Map<String, StockItem> list;

	public StockList() {
		this.list = new LinkedHashMap<>();
	}

	public int addStock(StockItem item) {
		if (item != null) {

			// Check if already have quantity of this item
			StockItem inStock = list.getOrDefault(item.getName(), item);
			if (inStock != item) {
				item.adjustStockQuantity(inStock.getInitialStockQuantity());
			}
			list.put(item.getName(), item);
			return item.getInitialStockQuantity();
		}
		return 0;
	}

	public int sellStock(String itemName, int quantity) {
		if (itemName != null && quantity > 0) {
			StockItem inStock = list.get(itemName);
			if (inStock != null && (inStock.getInitialStockQuantity() >= quantity)) {
				inStock.adjustStockQuantity(-(quantity));
				return quantity;
			}
		}
		return 0;
	}

	public StockItem get(String key) {
		return list.get(key);
	}

	public Map<String, StockItem> Items() {
		return Collections.unmodifiableMap(list);
	}

	@Override
	public String toString() {
		String s = "\nStock List\n";
		double totalCost = 0.0;
		for (Map.Entry<String, StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();

			double itemValue = stockItem.getInitialStockQuantity() * stockItem.getPrice();

			s = s + stockItem.getName() + ". There are " + stockItem.getInitialStockQuantity()
					+ " in stock. Value of items: ";
			s = s + itemValue + "\n";
			totalCost += itemValue;

		}

		return s + " Total stock value " + totalCost;

	}

}
