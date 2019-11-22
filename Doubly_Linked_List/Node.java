public class Node {
	private Object element;
	private Node prev;
	private Node next;
	
	public Node(Object element) {
		setElement(element);
		setPrev(null);
		setNext(null);
	}
	
	public Object getElement() {
		return element;
	}
	
	public void setElement(Object element) {
		this.element = element;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}
