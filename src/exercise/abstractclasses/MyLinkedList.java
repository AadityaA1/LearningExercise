package exercise.abstractclasses;

public class MyLinkedList implements NodeList {

	private ListItem root = null;

	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return root;

	}

	@Override
	public boolean addItem(ListItem item) {
		// TODO Auto-generated method stub
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
		while (currentItem.next() != null) {
			int comparison = currentItem.compareTo(item);
			if (comparison == 0) {
				if (currentItem == root) {
					root = currentItem.next();
					root.setPrevious(null);
				} else {
					currentItem.previous().setNext(currentItem.next());
					currentItem.next().setPrevious(currentItem.previous());
				}
				return true;
			}
			currentItem = currentItem.next();
		}
		System.out.println("Item not found");
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		if (root == null) {
			System.out.println("List is empty");
		} else {
			while (root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}

	}

}
