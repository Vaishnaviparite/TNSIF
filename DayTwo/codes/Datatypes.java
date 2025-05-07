package DayTwo.codes;

public class Datatypes {
	public static void main(String args[]) {
		int x;

		x = 10;

		byte byteMax = 127;
		byte byteMin = -128;

		System.out.println("Min range of byte is " + byteMin + " Max range of byte is " + byteMax);

		short shortMax = 32767;
		short shortMin = -32768;

		System.out.println("Min range of short is " + shortMin + " Max range of short is " + shortMax);

		int maxInt = 2147483647;
		int minInt = -2147483648;

		System.out.println("Min range of int is " + minInt + " Max range of int is " + maxInt);

		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;

		System.out.println("Min range of long is " + minLong + " Max range of long is " + maxLong);

		boolean flag = false;
		System.out.println("Boolean value is " + flag);
		System.out.println(x + 20);
	}

}
