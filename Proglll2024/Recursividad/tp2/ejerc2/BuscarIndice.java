package tp2.ejerc2;

public class BuscarIndice {

	public static int buscarIndice(int[] arr, int num, int inicio,int fin) {
		int medio;
		if (inicio > fin) {
			return -1;
		}else {
			medio = (inicio + fin)/2;
			if (num > arr[medio]) {
				return buscarIndice(arr,num,medio+1,fin);
			}else {
				if (num < arr[medio]) {
					return buscarIndice(arr,num,inicio,medio-1);
				}else {
					return medio;
				}
			}
		}
	}
	
	public void imprimir(int[]arr, int num, int inicio,int fin){
        System.out.println("El elemento esta en la posicion " + buscarIndice(arr,num,inicio,fin));
    }
}


/*int medio = (fin + inicio)/2;
        if(inicio != medio){
            if (num > arr[medio]) {
                return buscarIndice(arr, num, medio, fin);
            }else if (num < arr[medio]){
                return buscarIndice(arr, num, inicio, medio);
            }else {
                return medio;
            }
        }else if (num == arr[medio]){
            return medio;
        }else return -1;
    }*/