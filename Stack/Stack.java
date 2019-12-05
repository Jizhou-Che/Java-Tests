public interface Stack {
	void push(Object o);
	Object pop() throws EmptyStackException;
	Object top() throws EmptyStackException;
	int size();
	boolean isEmpty();
	void clear();
	void print();
}
