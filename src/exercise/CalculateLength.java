package exercise;

public class CalculateLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcFeetAndInchesToCentimetres(20, 20));
		System.out.println(calcFeetAndInchesToCentimetres(20));

	}

	public static double calcFeetAndInchesToCentimetres(double feet, double inches) {
		double valueInCm = -1;
		double valueFeetInCm = -1;
		double valueInchInCm = -1;
		if (feet < 0 || (inches < 0 && inches > 12)) {
			valueInCm = -1;
		} else {
			valueFeetInCm = feet * 30.48d;
			valueInchInCm = inches * 2.54d;
			valueInCm = valueFeetInCm + valueInchInCm;
		}
		return valueInCm;

	}

	public static double calcFeetAndInchesToCentimetres(double inches) {
		double valueInFeet = -1;

		if (inches < 0) {
			valueInFeet = -1;
		} else {
			valueInFeet = inches / 12;
		}
		return valueInFeet;

	}
}
