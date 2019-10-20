import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		// Check if there is only one command-line argument.
		if (args.length != 1) {
			System.out.println("Incorrect number of command-line arguments.");
			System.exit(1);
		}
		
		// Get number of user inputs.
		int number_of_inputs = 0;
		// Check if the command-line argument is an integer.
		try {
			number_of_inputs = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {
			System.err.println("Argument must be an integer.");
			System.exit(2);
		}
		
		// Concatenate user inputs.
		Scanner input = new Scanner(System.in);
		String s = "";
		for (int i = 0; i < number_of_inputs; i++) {
			s += input.nextLine();
		}
		
		// Print the concatenated string.
		System.out.println("Concatenated string: " + s);
	}
}
