package exercise.abstractclasses;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
	}

	@Override
	protected ListItem next() {
		// TODO Auto-generated method stub
		return this.rightLink;
	}

	@Override
	protected ListItem setNext(ListItem item) {
		// TODO Auto-generated method stub
		this.rightLink = item;
		return this.rightLink;
	}

	@Override
	protected ListItem previous() {
		// TODO Auto-generated method stub
		return this.leftLink;
	}

	@Override
	protected ListItem setPrevious(ListItem item) {
		// TODO Auto-generated method stub
		this.leftLink = item;
		return this.leftLink;
	}

	@Override
	protected int compareTo(ListItem item) {
		// TODO Auto-generated method stub
		if (item != null)
			return ((String) super.getValue()).compareTo((String) item.getValue());
		else
			return -1;
	}

}
