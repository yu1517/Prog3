package tp1.ejerc5;

import java.util.Iterator;

public class MyIterator implements Iterator <Integer>{
	private Node <Integer>cursor;
	
	public MyIterator (Node<Integer> cursor) {
		this.cursor = cursor;
	}
	public boolean hasNext() {
		return this.cursor != null;
	}
	public Integer next() {
		Integer info = this.cursor.getInfo();
		this.cursor = this.cursor.getNext();
		return info;
	}
	
	public Integer get() {
		return this.cursor.getInfo();
	}

}
