package tp2.ejerc7;

public class QuickSort {

	public void sort(int[] arr) {
        Quicksort(arr, 0, arr.length - 1);
    }
	
	//Metodo de Ordenamiento QuickSort
    public static void Quicksort(int numeros[], int izq, int der){
            //Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor Y el ultimo
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j){
               while (numeros[i] <= pivote && i < j){
                  i++;
            }
               while (numeros[j] > pivote) {
                  j--;   
            }
               if (i<j){                                     
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izq] = numeros[j]; 
             numeros[j] = pivote;

             if (izq < j-1) {
                Quicksort(numeros,izq,j-1);
    			}
             if (j+1 < der) {
            	 Quicksort(numeros,j+1,der);            	 
             }
      }
}
