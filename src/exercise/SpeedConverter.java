package exercise;
public class SpeedConverter {

	public static long toMilesPerHour(double kilometersPerHour) {
		double milesPerHour = -1;
		if (kilometersPerHour > 0) {
			milesPerHour = kilometersPerHour * 0.621371d;
			return (long) Math.round(milesPerHour);
		}
		return (long) milesPerHour;
	}

	public static void main(String[] args) {
		System.out.println(toMilesPerHour(10.25));
	}

	public static void printConversion(double kilometersPerHour) {
		System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
	}
}