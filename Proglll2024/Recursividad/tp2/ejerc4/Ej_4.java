package tp2.ejerc4;

public class Ej_4 {
	
	public static void fibonacci(int numero, int anterior,int actual) {
		if(numero >= 0) {			
			int resultado = anterior;
			System.out.print(resultado + " ");
			resultado = anterior + actual;
			anterior = actual;
			actual = resultado;
			fibonacci(numero-1,anterior,actual);
		 }
	}
	
	public static void imprimir(int anterior) {
		System.out.print(anterior + " ");
	}
}

/* 
 if (numero >= 0) {
            imprimir(anterior); // Imprimir el número anterior antes de calcular el siguiente
            if (numero > 0) {
                fibonacci(numero - 1, actual, anterior + actual);
            }
        }
*/