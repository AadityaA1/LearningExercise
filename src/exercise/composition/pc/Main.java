package exercise.composition.pc;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(12, 15, 30);
		Case theCase = new Case("8763D", "Dell", "240V", dimensions);

		Resolution nativeResolution = new Resolution(1366, 766);
		Monitor monitor = new Monitor("27 inch", "Acer", 27, nativeResolution);

		Motherboard motherboard = new Motherboard("AMD", 2, 3, "v2.44");

		PC pc = new PC(theCase, monitor, motherboard);

		// Accessing the draw pixel at from PC object
		pc.getMonitor().drawPixelAt(1500, 1200, "red");

		pc.getMotherboard().loadProgram("Windows 10");

	}
}