package tp2.ejerc3;

import java.util.ArrayList;

public class Ej_3 {
	ArrayList<Integer> aux = new ArrayList<Integer>();   //creo la lista donde se van a guardar los num binarios
	
    public ArrayList<Integer> binario(int n){
        int divisor = 2;
        
        if(n >= divisor){				//condicion base
            aux.add(0, n % 2);		//calculo el resto y lo agrego al principio de la lista 
            return (binario(n/2));
        }
        else if(n < divisor){  //si el numero es mas chico que el divisor 
            aux.add(0,1);   //agrego un 1 al principio de aux
        }

        imprimir(aux);
        return aux;
    }

    public void imprimir (ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i));
        }

    }

}
