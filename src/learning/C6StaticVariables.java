package learning;

public class C6StaticVariables {

	private static String name;

	public C6StaticVariables(String name) {
		C6StaticVariables.name = name;
	}

	public void printName() {
		System.out.println("name= " + name);
	}

	public static void main(String[] args) {
		C6StaticVariables rex = new C6StaticVariables("rex");
		C6StaticVariables fluffy = new C6StaticVariables("fluffy");

		rex.printName();
		fluffy.printName();
	}

}
