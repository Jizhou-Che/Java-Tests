public class DoublyLinkedList {
	private Node head, tail;
	
	DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void append(Object o) throws NullNodeException {
		if (o == null) {
			throw new NullNodeException();
		}
		
		Node n = new Node(o);
		
		if (this.tail == null) {
			this.head = this.tail = n;
		} else {
			this.tail.setNext(n);
			n.setPrev(this.tail);
			this.tail = n;
		}
	}
	
	public Object detach() throws EmptyListException {
		if (this.tail == null) {
			throw new EmptyListException();
		} else {
			Object o = this.tail.getElement();
			this.tail = this.tail.getPrev();
			if (this.tail == null) {
				this.head = null;
			} else {
				this.tail.setNext(null);
			}
			return o;
		}
	}
	
	public void push(Object o) throws NullNodeException {
		if (o == null) {
			throw new NullNodeException();
		}
		
		Node n = new Node(o);
		
		if (this.head == null) {
			this.head = this.tail = n;
		} else {
			n.setNext(this.head);
			this.head.setPrev(n);
			this.head = n;
		}
	}
	
	public Object pop() throws EmptyListException {
		if (this.head == null) {
			throw new EmptyListException();
		} else {
			Object o = this.head.getElement();
			this.head = this.head.getNext();
			if (this.head == null) {
				this.tail = null;
			} else {
				this.head.setPrev(null);
			}
			return o;
		}
	}
	
	public void clear() {
		this.head = this.tail = null;
	}
	
	public void print() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.getElement());
			temp = temp.getNext();
		}
	}
}
