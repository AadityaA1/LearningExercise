package learning;

public class C7InstanceVariables {

	private String name;

	public C7InstanceVariables(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("name= " + name);
	}

	public static void main(String[] args) {
		C7InstanceVariables rex = new C7InstanceVariables("rex");
		C7InstanceVariables fluffy = new C7InstanceVariables("fluffy");

		rex.printName();
		fluffy.printName();
	}

}
