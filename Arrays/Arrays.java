// A demonstration of arrays.

public class Arrays {
	public static void main(String[] args) {
		// Demonstration of one-dimensional array.
		int[] a = new int[4];
		a[0] = 0;
		a[3] = 3;
		System.out.println("One-dimensional array:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		
		// Demonstration of two-dimensional array.
		int[][] b = new int[4][];
		b[0] = new int[8];
		b[1] = new int[4];
		b[2] = new int[2];
		b[3] = new int[1];
		System.out.println("Two-dimensional array:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		// Demonstration of two-dimensional array.
		int[][] c = {{0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3}, {0, 1}, {0}};
		System.out.println("Two-dimensional array:");
		for (int[] i : c) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// Demonstration of char array.
		char[] cs = {'J', 'o', 'n', 'y'};
		System.out.println("Character array:");
		System.out.println(cs);
		
		// Demonstration of String array.
		String[] ss = {"Jony ", "is ", "smart!\n"};
		System.out.println("String array:");
		for (String s : ss) {
			System.out.print(s);
		}
	}
}
