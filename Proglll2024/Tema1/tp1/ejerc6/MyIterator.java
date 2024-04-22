package tp1.ejerc6;

import java.util.Iterator;

public class MyIterator implements Iterator <Integer> {

private Node cursor;
	
	public MyIterator (Node cursor) {
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
