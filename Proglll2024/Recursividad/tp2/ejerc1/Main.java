package tp2.ejerc1;
/*Implemente un algoritmo recursivo que determine si un arreglo de tamaño N está ordenado.
1. ¿Qué complejidad O tiene? (La complejidad en el peor caso)
2. ¿Trae algún problema hacerlo recursivo? ¿Cuál?
3. ¿Qué cambiaría si la estructura fuera una lista en lugar de un arreglo?*/
public class Main {
	public static void main(String[] args) {
		
		int arregloOrdenado[] = {1, 2, 3, 4, 5};
        int arregloDesordenado[]= {1,2,3,5,4};
        Ej_1 verificador = new Ej_1();

        verificador.imprimir(arregloOrdenado, 0);
        verificador.imprimir(arregloDesordenado,0);
	}
}
