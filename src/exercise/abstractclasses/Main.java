package exercise.abstractclasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1";
		String b = "2";
		System.out.println(a.compareTo(b));

		MyLinkedList list = new MyLinkedList(null);

		list.addItem(new Node("5"));
		list.addItem(new Node("2"));
		list.addItem(new Node("3"));
		list.addItem(new Node("4"));
		list.addItem(new Node("5"));
		list.addItem(new Node("2"));
		list.addItem(new Node("1"));
		list.addItem(new Node("7"));

		list.traverse(list.getRoot());

	}

}
