package tp1.ejerc5;
/*Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
suponiendo que: a) Las listas están desordenadas y la lista resultante debe quedar ordenada. 
b)7Las listas están ordenadas y la lista resultante debe mantenerse ordenada.*/

public class MySimpleLinkedList implements Iterable<Integer>{
	private Node<Integer> first;
    private int size;
    
    public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
    
    public void newList(MySimpleLinkedList a, MySimpleLinkedList b) {
		
		MySimpleLinkedList newList= new MySimpleLinkedList();  //creo nueva lista que va a tener los elementos de ambas listas a y b 
		
		Node<Integer> auxA = new Node<Integer>(a.first.getInfo(),a.first); //creo un nuevo nodo que apunta inicialmente al primer nodo de la lista a, contiene el mismo valor que el primer nodo de la lista a
		Node<Integer> auxB = new Node<Integer>(b.first.getInfo(),b.first);
		
		while(auxA != null) {
			
			if(auxA.getInfo() < auxB.getInfo()) {
				auxA = auxA.getNext();
			}
			
			else if(auxA.getInfo() > auxB.getInfo()) {
				auxB = auxB.getNext();
			}
			
			else if(auxA.getInfo() == auxB.getInfo()) {  //si los valores son iguales 
				newList.insertFront(auxA.getInfo());   //inserto el valor en la nueva lista al frende de la lista 
				auxA = auxA.getNext();
				auxB = auxB.getNext();
			}
			
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
			Node<Integer> nodoAux = this.first;
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

}
