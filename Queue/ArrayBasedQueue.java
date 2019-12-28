public class ArrayBasedQueue implements Queue {
	private Object[] objects;
	private int nextDequeueIndex;
	private int nextEnqueueIndex;
	
	ArrayBasedQueue() {
		clear();
	}
	
	@Override
	public void enqueue(Object o) {
		if (size() + 1 == objects.length) {
			// Copy to a larger array.
			Object[] temp = new Object[objects.length * 2];
			System.arraycopy(objects, nextDequeueIndex, temp, 0, objects.length - nextDequeueIndex);
			System.arraycopy(objects, 0, temp, objects.length - nextDequeueIndex, nextEnqueueIndex + 1);
			nextDequeueIndex = 0;
			nextEnqueueIndex = objects.length - 1;
			objects = temp;
		}
		objects[nextEnqueueIndex] = o;
		nextEnqueueIndex = (nextEnqueueIndex + 1) % objects.length;
	}
	
	@Override
	public Object dequeue() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			Object o = objects[nextDequeueIndex];
			nextDequeueIndex = (nextDequeueIndex + 1) % objects.length;
			return o;
		}
	}
	
	@Override
	public Object front() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return objects[nextDequeueIndex];
		}
	}
	
	@Override
	public int size() {
		return (nextEnqueueIndex - nextDequeueIndex + objects.length) % objects.length;
	}
	
	@Override
	public boolean isEmpty() {
		return nextEnqueueIndex == nextDequeueIndex;
	}
	
	@Override
	public void clear() {
		objects = new Object[8];
		nextDequeueIndex = 0;
		nextEnqueueIndex = 0;
	}
	
	@Override
	public void print() {
		int i = nextDequeueIndex;
		while (i != nextEnqueueIndex) {
			System.out.println(objects[i].toString());
			i = (i + 1) % objects.length;
		}
	}
}
