package tp1.ejerc6;
/*Escriba una funcion que dadas dos listas construya otra con los elementos que estan en la primera pero no en la segunda*/

public class Main {
	public static void main(String[] args) {
		
	MySimpleLinkedList listaA = new MySimpleLinkedList();
	listaA.insertFront(15);
	listaA.insertFront(13);
	listaA.insertFront(11);
	listaA.insertFront(9);
	listaA.insertFront(7);

	MySimpleLinkedList listaB = new MySimpleLinkedList();
	listaB.insertFront(15);
	listaB.insertFront(14);
	listaB.insertFront(13);
	listaB.insertFront(12);
	listaB.insertFront(11);
	
	MySimpleLinkedList listaC = new MySimpleLinkedList();
	//listaC.newList(listaA, listaB);
	listaC.newList(listaA, listaB);
	
	}
}
