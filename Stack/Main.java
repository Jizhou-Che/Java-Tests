import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayBasedStack stack = new ArrayBasedStack();

		printOptions();

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("> ");
			int option;
			try {
				option = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				option = -1;
			}

			switch (option) {
				case 1:
					System.out.print("The integer to push?: ");
					try {
						int value = Integer.parseInt(input.nextLine());
						stack.push(value);
						System.out.println(value + " pushed.");
					} catch (NumberFormatException e) {
						System.out.println("Not an integer.");
					}
					break;
				case 2:
					try {
						System.out.println(stack.pop() + " popped.");
					} catch (EmptyStackException e) {
						System.out.println("The stack is empty.");
					}
					break;
				case 3:
					try {
						System.out.println("Top of stack is " + stack.top() + ".");
					} catch (EmptyStackException e) {
						System.out.println("The stack is empty.");
					}
					break;
				case 4:
					System.out.println("Size of stack is " + stack.size() + ".");
					break;
				case 5:
					if (stack.isEmpty()) {
						System.out.println("Stack is empty.");
					} else {
						System.out.println("Stack is not empty.");
					}
					break;
				case 7:
					stack.clear();
					System.out.println("Stack cleared.");
					break;
				case 8:
					stack.print();
					break;
				case 9:
					printOptions();
					break;
				case 0:
					return;
				default:
					System.out.println("Invalid option.");
					break;
			}
		}
	}

	private static void printOptions() {
		System.out.println("1: Push");
		System.out.println("2: Pop");
		System.out.println("3: Top");
		System.out.println("4: Check size");
		System.out.println("5: Check empty");
		System.out.println("7: Clear the stack");
		System.out.println("8: Print the stack");
		System.out.println("9: See all options");
		System.out.println("0: Quit");
	}
}
