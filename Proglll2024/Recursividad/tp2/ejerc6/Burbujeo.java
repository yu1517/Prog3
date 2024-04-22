package tp2.ejerc6;

public class Burbujeo {

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        System.out.println("Arreglo original:");
	        printArray(arr);
	        
	        bubbleSort(arr);
	        
	        System.out.println("Arreglo ordenado:");
	        printArray(arr);
	    }
	    
	    //BUBBLE SORT ADAPTATIVO 
	    public static void bubbleSort(int[] arr) {  
	        int n = arr.length;
	        boolean swapped = true;
	        
	        while (swapped) {
	            swapped = false;
	            for (int i = 0; i < n - 1; i++) {
	                if (arr[i] > arr[i + 1]) {
	                    // Intercambiar elementos si están en el orden incorrecto
	                    int temp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // Reducir el tamaño del arreglo en cada iteración
	            n--;
	        }
	    }
	    /*
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        
	        // Iterar sobre todos los elementos del arreglo
	        for (int i = 0; i < n - 1; i++) {
	            // Últimos i elementos ya están en su lugar, así que no es necesario compararlos
	            for (int j = 0; j < n - i - 1; j++) {
	                // Si el elemento actual es mayor que el siguiente, intercámbialos
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	    */
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}
