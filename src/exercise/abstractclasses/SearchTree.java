package exercise.abstractclasses;

public class SearchTree implements NodeList {

	private ListItem root = null;

	public SearchTree(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	@Override
	public boolean addItem(ListItem item) {
		if (root == null) {
			root = item;
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if (comparison < 0) {
				if (currentItem.next() == null) {
					currentItem.setNext(item);
					item.setPrevious(currentItem);
					return true;
				} else {
					currentItem = currentItem.next();
				}
			} else if (comparison > 0) {
				if (currentItem.previous() != null) {
					currentItem.previous().setNext(item);
					item.setPrevious(currentItem.previous());

					currentItem.setPrevious(item);
					item.setNext(currentItem);

				} else {
					root = item;
					item.setNext(currentItem);
					currentItem.setPrevious(root);
				}
				return true;
			} else {
				System.out.println("Item already present");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		ListItem currentItem = root;
		int comparison = currentItem.compareTo(item);
		while (currentItem.next() != null) {
			if (comparison == 0) {
				if (currentItem == root) {
					root = currentItem.next();
					root.setPrevious(null);
				} else {
					currentItem.previous().setNext(currentItem.next());
					currentItem.next().setPrevious(currentItem.previous());
				}
				return true;
			} else {
				currentItem = currentItem.next();
			}
		}
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		if (root != null) {
			traverse(root.previous());
			System.out.println(root.getValue());
			traverse(root.next());

		}
	}

}
