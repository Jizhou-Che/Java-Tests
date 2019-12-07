public interface Queue {
	void enqueue(Object o);
	Object dequeue() throws EmptyQueueException;
	Object front() throws EmptyQueueException;
	int size();
	boolean isEmpty();
	void clear();
	void print();
}
