package tp2.ejerc6;

public class Seleccion {

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};
	        System.out.println("Arreglo original:");
	        printArray(arr);
	        
	        selectionSort(arr);
	        
	        System.out.println("Arreglo ordenado:");
	        printArray(arr);
	    }
	    
	    public static void selectionSort(int[] arr) {
	        int n = arr.length;
	        
	        // Iterar sobre todos los elementos del arreglo
	        for (int i = 0; i < n - 1; i++) {
	            // Encontrar el elemento mínimo en el subarreglo no ordenado
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            
	            // Intercambiar el elemento mínimo con el primer elemento del subarreglo no ordenado
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}


