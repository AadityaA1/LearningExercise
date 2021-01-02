package exercise.composition.house;

public class House {

	private Door door;
	private Window window;

	public House(Door door, Window window) {
		this.door = door;
		this.window = window;
	}

	public Door getDoor() {
		return door;
	}

	public Window getWindow() {
		return window;
	}

}
