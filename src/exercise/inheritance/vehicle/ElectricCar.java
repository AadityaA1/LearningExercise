package exercise.inheritance.vehicle;

public class ElectricCar extends Car {

	private boolean autoPilot;

	public ElectricCar(String name, boolean autoPilot, String size, int wheels, int doors, int gears, boolean isManual,
			int currentGear) {
		super("Tesla", size, 4, 5, 5, false, currentGear);
		this.autoPilot = autoPilot;
		// TODO Auto-generated constructor stub
	}

	public boolean getAutoPilot() {
		return autoPilot;
	}

}
