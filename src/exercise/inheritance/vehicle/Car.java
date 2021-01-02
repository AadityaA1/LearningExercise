package exercise.inheritance.vehicle;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = currentGear;
	}

	public void changeCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear() - changed to " + this.currentGear + " gear.");
	}

	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
	}

}
