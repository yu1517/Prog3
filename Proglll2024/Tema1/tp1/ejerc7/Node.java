package tp1.ejerc7;

public class Node {

	private Integer info;
	private Node next;
	private Node prev;
	
	public Node() {
		this.info = null;
		this.next = null;
		this.prev = null;
	}
	
	public Node(Integer o, Node n) {
		this.setInfo(o);
		this.setNext(n);
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Integer getInfo() {
		return info;
	}
	public void setInfo(Integer info) {
		this.info = info;
	}
}
