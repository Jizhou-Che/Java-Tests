import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayBasedQueue queue = new ArrayBasedQueue();
		
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
					System.out.print("The integer to enqueue?: ");
					try {
						int value = Integer.parseInt(input.nextLine());
						queue.enqueue(value);
						System.out.println(value + " enqueued.");
					} catch (NumberFormatException e) {
						System.out.println("Not an integer.");
					}
					break;
				case 2:
					try {
						System.out.println(queue.dequeue() + " dequeued.");
					} catch (EmptyQueueException e) {
						System.out.println("The queue is empty.");
					}
					break;
				case 3:
					try {
						System.out.println("Front of queue is " + queue.front() + ".");
					} catch (EmptyQueueException e) {
						System.out.println("The queue is empty.");
					}
					break;
				case 4:
					System.out.println("Size of queue is " + queue.size() + ".");
					break;
				case 5:
					if (queue.isEmpty()) {
						System.out.println("Queue is empty.");
					} else {
						System.out.println("Queue is not empty.");
					}
					break;
				case 7:
					queue.clear();
					System.out.println("Queue cleared.");
					break;
				case 8:
					queue.print();
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
		System.out.println("1: Enqueue");
		System.out.println("2: Dequeue");
		System.out.println("3: Check front");
		System.out.println("4: Check size");
		System.out.println("5: Check empty");
		System.out.println("7: Clear the queue");
		System.out.println("8: Print the queue");
		System.out.println("9: See all options");
		System.out.println("0: Quit");
	}
}
