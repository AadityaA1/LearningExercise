package exercise.polymorphism.car;

public class Car {

	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;

	public Car(int cylinders, String name) {
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}

	public void startEngine() {
		System.out.println("Car -> startEngine()");
	}

	public void accelerate() {
		System.out.println("Car -> accelerate()");
	}

	public void brake() {
		System.out.println("Car -> brake()");
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

}
