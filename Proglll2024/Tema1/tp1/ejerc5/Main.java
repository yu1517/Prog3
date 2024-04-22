package tp1.ejerc5;
/*Escriba un procedimiento que dadas dos listas construya otra con los elementos comunes,
suponiendo que: a) Las listas están desordenadas y la lista resultante debe quedar ordenada. 
b)7Las listas están ordenadas y la lista resultante debe mantenerse ordenada.*/
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
