import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
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
					System.out.print("The integer to append?: ");
					try {
						int value = Integer.parseInt(input.nextLine());
						list.append(value);
						System.out.println(value + " appended.");
					} catch (NumberFormatException e) {
						System.out.println("Not an integer.");
					} catch (NullNodeException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						System.out.println(list.detach() + " detached.");
					} catch (EmptyListException e) {
						System.out.println("The list is empty.");
					}
					break;
				case 3:
					System.out.print("The integer to push?: ");
					try {
						int value = Integer.parseInt(input.nextLine());
						list.push(value);
						System.out.println(value + " pushed.");
					} catch (NumberFormatException e) {
						System.out.println("Not an integer.");
					} catch (NullNodeException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						System.out.println(list.pop() + " popped.");
					} catch (EmptyListException e) {
						System.out.println("The list is empty.");
					}
					break;
				case 7:
					list.clear();
					System.out.println("List cleared.");
					break;
				case 8:
					list.print();
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
		System.out.println("1: Append");
		System.out.println("2: Detach");
		System.out.println("3: Push");
		System.out.println("4: Pop");
		System.out.println("7: Clear the list");
		System.out.println("8: Print the list");
		System.out.println("9: See all options");
		System.out.println("0: Quit");
	}
}
