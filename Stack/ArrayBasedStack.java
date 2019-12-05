public class ArrayBasedStack implements Stack {
	Object[] objects;
	int topIndex;

	ArrayBasedStack() {
		clear();
	}

	@Override
	public void push(Object o) {
		if (size() == objects.length) {
			Object[] temp = new Object[objects.length * 2];
			System.arraycopy(objects, 0, temp, 0, objects.length);
			objects = temp;
		}
		topIndex++;
		objects[topIndex] = o;
	}

	@Override
	public Object pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			topIndex--;
			return objects[topIndex + 1];
		}
	}

	@Override
	public Object top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			return objects[topIndex];
		}
	}

	@Override
	public int size() {
		return topIndex + 1;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void clear() {
		objects = new Object[8];
		topIndex = -1;
	}

	@Override
	public void print() {
		for (int i = 0; i < size(); i++) {
			System.out.println(objects[i].toString());
		}
	}
}
