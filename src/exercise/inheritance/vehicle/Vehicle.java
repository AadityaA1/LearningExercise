package exercise.inheritance.vehicle;

public class Vehicle {

	private String name;
	private String size;

	private int currentVelocity;
	private int currentDirection;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentDirection = 0;
		this.currentVelocity = 0;
	}

	public void steer(int direction) {
		this.currentDirection += direction;

	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;

		System.out.println("Vehicle.move() Moving at " + currentVelocity + " @ " + currentDirection);
	}
}
