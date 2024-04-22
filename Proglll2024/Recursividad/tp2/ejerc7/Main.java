package tp2.ejerc7;

public class Main {

	    public static void main(String[] args) {
	    	/*
	    	 // Arreglo de números desordenados
	        int[] arr = {64, 25, 12, 22, 11};

	        // Imprime el arreglo original
	        System.out.println("Arreglo original:");
	        printArray(arr);
	        
	        // Crea una instancia de MergeSort2
	        MergeSort2 mergeSorter = new MergeSort2();

	        // Ordena el arreglo usando MergeSort
	        mergeSorter.sort(arr);

	        // Imprime el arreglo ordenado
	        System.out.println("Arreglo ordenado:");
	        mergeSorter.printArray(arr);
	    */

	    //---------------------------
	    //QUICKSORT
	    int[] arr2 = {38,9,15,17,65,7};
	    System.out.println("Arreglo original:");
        printArray(arr2);

        QuickSortAlgoritmo quickSort = new QuickSortAlgoritmo();
        quickSort.sort(arr2);

        System.out.println("Arreglo ordenado:");
        printArray(arr2);
        
        QuickSort quickSort2 = new QuickSort();
        quickSort2.sort(arr2);
	    }	    
	    
		private static void printArray(int[] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
			
		}
}
