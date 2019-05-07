public class Primitive_Data_Types{
	static final byte MIN_BYTE = (byte) (- Math.pow(2, 7)), MAX_BYTE = (byte) (Math.pow(2, 7) - 1);
	static final short MIN_SHORT = (short) (- Math.pow(2, 15)), MAX_SHORT = (short) (Math.pow(2, 15) - 1);
	static final int MIN_INT = (int) (- Math.pow(2, 31)), MAX_INT = (int) (Math.pow(2, 31) - 1);
	static final long MIN_LONG = (long) (- Math.pow(2, 63)), MAX_LONG = (long) (Math.pow(2, 63) - 1);
	public static void main(String[] args){
		System.out.println("Range of byte: " + Byte.toString(MIN_BYTE) + " to " + Byte.toString(MAX_BYTE) + ".");
		System.out.println("Range of short: " + Short.toString(MIN_SHORT) + " to " + Short.toString(MAX_SHORT) + ".");
		System.out.println("Range of int: " + Integer.toString(MIN_INT) + " to " + Integer.toString(MAX_INT) + ".");
		System.out.println("Range of long: " + Long.toString(MIN_LONG) + " to " + Long.toString(MAX_LONG) + ".");
		System.out.println("Range of float: " + Float.toString(Float.MIN_VALUE) + " to " + Float.toString(Float.MAX_VALUE) + ".");
		System.out.println("Range of double: " + Double.toString(Double.MIN_VALUE) + " to " + Double.toString(Double.MAX_VALUE) + ".");
		long longValue = 99999999999999999L;
		System.out.println(Long.toString(longValue));
		float floatValue = 3.14f;
		System.out.println(Float.toString(floatValue));
		double doubleValue = 3.1415926d;
		System.out.println(Double.toString(doubleValue));
		boolean boolValue = true;
		System.out.println("The negation of " + Boolean.toString(boolValue) + " is " + Boolean.toString(!boolValue) + ".");
		char charValue = 'c';
		System.out.println(Character.toString(charValue));
		String stringObject = "In Java, Strings are immutable objects.";
		System.out.println(stringObject);
	}
}
