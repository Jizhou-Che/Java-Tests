// A demonstration of primitive data types.

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		// Test the range of primitive data types.
		System.out.println("Range of byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ".");
		System.out.println("Range of short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ".");
		System.out.println("Range of int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ".");
		System.out.println("Range of long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ".");
		System.out.println("Range of float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ".");
		System.out.println("Range of double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ".");
		
		// Demonstration of long.
		long longValue = 2147483648L;
		System.out.println("The long value is " + longValue + ".");
		
		// Demonstration of float.
		float floatValue = 3.14159265358979323846F;
		System.out.println("The float value is " + floatValue + ".");
		
		// Demonstration of double.
		double doubleValue = 3.14159265358979323846D;
		System.out.println("The double value is " + doubleValue + ".");
		
		// Demonstration of using exponents in float and double.
		System.out.println("1E-9F * 1E9D = " + 1E-9F * 1E9D + ".");
		System.out.println("1E-99 * 1E99 = " + 1E-99 * 1E99 + ".");
		
		// Demonstration of char.
		char charValue = 'c';
		System.out.println("The character is " + charValue + ".");
		
		// Demonstration of boolean.
		boolean boolValue = true;
		System.out.println("The negation of " + boolValue + " is " + !boolValue + ".");
	}
}
