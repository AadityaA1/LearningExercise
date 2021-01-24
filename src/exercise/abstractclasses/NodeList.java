package exercise.abstractclasses;

public interface NodeList {

	public abstract ListItem getRoot();

	public abstract boolean addItem(ListItem item);

	public abstract boolean removeItem(ListItem item);

	public abstract void traverse(ListItem item);
}
