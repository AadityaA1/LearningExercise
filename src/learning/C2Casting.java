package learning;

public class C2Casting {

	public static void main(String[] args) {

		byte minByteValue = Byte.MIN_VALUE;

		// In Java, by default all whole numbers will be
		// considered as int. so we need to do casting

		byte byteValue = (byte) (minByteValue / 2);
		System.out.println(byteValue);

		byte ibyte = -125;
		short ishort = 327;
		int iInt = 765;

		long ilong = 50000L + (10L * (ibyte + ishort + iInt));
		System.out.println(ilong);

		short shortTotal = (short) (1000 + (10 * (ibyte + ishort + iInt)));

		System.out.println(shortTotal);

	}
}
