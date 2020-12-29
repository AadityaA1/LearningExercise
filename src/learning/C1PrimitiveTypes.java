package learning;
//8 primitive types are
// int, boolean, byte, short, float, double, char, long

public class C1PrimitiveTypes {

	public static void main(String[] args) {

		// int occupies 32 bits memory
		int minIntValue = Integer.MIN_VALUE; // -2147483648

		int maxIntValue = Integer.MAX_VALUE; // 2147483647
		System.out.println(minIntValue);
		System.out.println(maxIntValue);
		// underflow
		System.out.println("Busted Min value " + (minIntValue - 1));
		// overflow
		System.out.println("Busted Min value " + (maxIntValue + 1));
		// underscore can be used for readability in int
		int a = 2_147_483_647;

		// byte occupies 8 bits
		byte minByteValue = Byte.MIN_VALUE; // -128
		byte maxByteValue = Byte.MAX_VALUE; // 127
		System.out.println(minByteValue);
		System.out.println(maxByteValue);

		// short occupies 16 bits
		short minShortValue = Short.MIN_VALUE; // -32768
		short maxShortValue = Short.MAX_VALUE; // 32767
		System.out.println(minShortValue);
		System.out.println(maxShortValue);

		// long occupies 64 bits
		long minLongValue = Long.MIN_VALUE; // -9223372036854775808
		long maxLongValue = Long.MAX_VALUE; // 9223372036854775807
		System.out.println(minLongValue);
		System.out.println(maxLongValue);

		// without L mentioned, Java will treat the number as integer
		// so treat as long, include L at the end
		long b = 2147483647987L;
		System.out.println(b);

		// float (single precision type) - occupies 32 bits in memory
		// double (double precission type) - occupies 64 bits in memory

		float minFloatValue = Float.MIN_VALUE;
		float maxFloatValue = Float.MAX_VALUE;
		System.out.println(minFloatValue);
		System.out.println(maxFloatValue);

		double mindoubleValue = Double.MIN_VALUE;
		double maxdoubleValue = Double.MAX_VALUE;
		System.out.println(mindoubleValue);
		System.out.println(maxdoubleValue);

		int myIntValue = 5;
		// by default, any decimal value will be treated as double
		// so f needs to be added, to explicitly mention it is float
		float myFloatValue = 5.25f;
		double myDoubleValue = 6.25; // double is preferred data type for decimals
		// double faster

		int i = 5 / 3;
		float f = 5f / 3f;
		double d = 5d / 3d;
		System.out.println(i); // 1
		System.out.println(f); // 1.6666666 (7 digits precision)
		System.out.println(d); // 1.6666666666666667 (16 digits precision)

		// challenge
		// convert pounds to kilogram
		double pounds = 100d;
		double kgs = pounds * 0.45359237;
		System.out.println("Equivalent kgs value is " + kgs);

		// for precise calculations , both float/double should not be used
		// in this case, java has a class called BigDecimal, which needs to be used

		// char - store single character
		char letter = 'D'; // 16 bits of memory
		// char allows to store unicode character

		char chara = '\u0044';
		System.out.println(chara);

	}

}
