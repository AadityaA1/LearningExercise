package exercise.composition.house;

public class Main {

	public static void main(String[] args) {

		Window window = new Window(10, 150, 200, "SandalWood");
		Door door = new Door(true, "Rosewood", "TeakWood", window);

		House house = new House(door, window);
		house.getWindow().windowMaterial();
	}

}
