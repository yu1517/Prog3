package tp1.ejerc7;

public class MySimpleLinkedList {

	protected Node first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(Integer o) {
		Node tmp = new Node(o,null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	public Integer extractFront() {
		Integer output = null;
		if (this.first != null) {
			output = this.first.getInfo();
			this.first = this.first.getNext();
			this.size--;
		}
		return output;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	public int size() {
		return this.size;
	}
	
	/*el objetivo es devolver lo que hay en x-index
	 * ej: tengo una lista de elementos,me piden lo que esta guardado en el elemento numero 6*/
	public Integer get(int index) {
		if (index < size) {
			Node nodoAux = this.first;
			for (int i = 0; i < index; i++) {
				nodoAux = nodoAux.getNext();  //nodoAux lo usamos para ir referenciando a medida que vamos avanzando 
			}
			return nodoAux.getInfo();
		}
		return null;
	}
	public String toString() {
		String string = "";
		Node aux = this.first;
		for (int i = 0; i < size; i++) {
			aux = aux.getNext();
			string += aux.getInfo().toString();
		}
		return string;
	}
}
