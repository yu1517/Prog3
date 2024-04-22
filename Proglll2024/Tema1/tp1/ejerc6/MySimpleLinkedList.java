package tp1.ejerc6;
/*Escriba una funcion que dadas dos listas construya otra con los elementos que estan en la primera pero no en la segunda*/

public class MySimpleLinkedList implements Iterable <Integer> {

	private Node first;
    private int size;
    
    public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
    
    public void newList (MySimpleLinkedList A, MySimpleLinkedList B) {
    	MySimpleLinkedList newList = new MySimpleLinkedList();
    	
    	MyIterator it1 = A.iterator();
    	MyIterator it2 = B.iterator();
    	
    	while (it1.hasNext() && it2.hasNext()) {
    		Integer val1 = it1.get();
    		Integer val2 = it2.get();
    		
    		if (val1 < val2) {
    			it1.next();
    			newList.insertFront(val1);
    		}else if (val1 ==val2) {
    			it1.next();
    			it2.next();
    		}else {
    			it2.next();
    		}
    	}
    	while (it1.hasNext()) {
    		Integer val = it1.next();
    		newList.insertFront(val);
    	}
    	newList.ShowList();
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
	
	@Override
    public MyIterator iterator() {
        return new MyIterator(this.first);
    }
	
	public void ShowList() {
		MyIterator iterador= new MyIterator(this.first);
		
		while(iterador.hasNext()){
			int i= iterador.next();
			System.out.println(i);
		}
	}
	
	@Override
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
