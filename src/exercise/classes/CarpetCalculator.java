package exercise.classes;

public class CarpetCalculator {

	private Floor floor;
	private Carpet carpet;

	public CarpetCalculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}

	public double getTotalCost() {
		return (floor.getArea() * carpet.getCost());
	}
}
