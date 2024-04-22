package tp2.ejerc5;

public class Ej_5 {

	public boolean algoritmo(int[] arr, int index) {
        if (index >= arr.length) {
            return false;
        }
        
        if (arr[index] == index) {
            return true;
        }
        
        return algoritmo(arr, index + 1);
    }
}
