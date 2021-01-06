package exercise.polymorphism.car;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(6, "Car");
		car.startEngine();
		car.accelerate();
		car.brake();

		System.out.println();
		Ford ford = new Ford(4, "Ford Focus");
		ford.startEngine();
		ford.accelerate();
		ford.brake();

		System.out.println();
		Mitsubishi mitsubishi = new Mitsubishi(4, "Attriage");
		mitsubishi.startEngine();
		mitsubishi.accelerate();
		mitsubishi.brake();
	}

}