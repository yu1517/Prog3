package tp2.ejerc7;
/*
public class Mergesort {
	    public static void main(String[] args) {
	        int[] arr = {64, 7, 12, 22, 9};
	        System.out.println("Arreglo original:");
	        printArray(arr);
	        
	        mergeSort(arr, 0, arr.length - 1);
	        
	        System.out.println("Arreglo ordenado:");
	        printArray(arr);
	    }
	    
	    public static void mergeSort(int[] arr, int l, int r) {
	        if (l < r) {
	            // Encuentra el punto medio del arreglo
	            int m = (l + r) / 2;
	            
	            // Ordena la primera mitad y la segunda mitad recursivamente
	            mergeSort(arr, l, m);
	            mergeSort(arr, m + 1, r);
	            
	            // Combina las dos mitades ordenadas
	            merge(arr, l, m, r);
	        }
	    }
	    
	    public static void merge(int[] arr, int l, int m, int r) {
	        // Tamaño de los subarreglos
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        
	        // Arreglos temporales
	        int[] L = new int[n1];
	        int[] R = new int[n2];
	        
	        // Copia los datos a los arreglos temporales
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	        
	        // Índices iniciales de los subarreglos
	        int i = 0, j = 0;
	        
	        // Índice inicial del arreglo fusionado
	        int k = l;
	        
	        // Fusiona los arreglos temporales de vuelta al arreglo original
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            } else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        
	        // Copia los elementos restantes de L[], si hay alguno
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        
	        // Copia los elementos restantes de R[], si hay alguno
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	    
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}

*/
