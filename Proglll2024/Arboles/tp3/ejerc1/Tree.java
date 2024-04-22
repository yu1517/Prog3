package tp3.ejerc1;

import java.util.ArrayList;
import java.util.List;

public class Tree {

	private TreeNode root;

	public Tree() {
		this.root = null;
	}

	public void add(Integer value) {
		if (this.root == null) {
			this.root = new TreeNode(value);
		} else {
			this.add(this.root, value);
		}
	}

	private void add(TreeNode nodo, Integer value) {
		if (nodo.getValue() > value) {
			if (nodo.getLeft() == null) {
				TreeNode temp = new TreeNode(value);
				nodo.setLeft(temp);
			} else {
				add(nodo.getLeft(), value);
			}
		} else if (nodo.getValue() < value) {
			if (nodo.getRight() == null) {
				TreeNode temp = new TreeNode(value);
				nodo.setRight(temp);
			} else {
				add(nodo.getRight(), value);
			}
		}
	}

	public boolean hasElem(Integer value) {
		return hasElemRecursive(root, value);
	}

	private boolean hasElemRecursive(TreeNode nodo, Integer value) {
		if (nodo == null) {
			return false;
		}
		if (nodo.getValue().equals(value)) {
			return true;
		}
		return hasElemRecursive(nodo.getLeft(), value) || hasElemRecursive(nodo.getRight(), value);
	}

/*
	public boolean hasElem(TreeNode actual,Integer value) { //RECIBE EL NODO ACTUAL Y EL VALOR QUE BUSCAMOS 
	 if(actual.getValue()<value) {                          //SI EL VALOR DEL NODO ACTUAL ES MENOR QUE EL VALOR QUE BUSCAMOS 
		 if(actual.getRight()==null) { //SI EL SUBARBOL DERECHO DEL NODO ES NULO, SIG QUE ALCANZAMOS UNA HOJA Y EL VALOR NO ESTA DEL LADO DEREC 
			 return false; 
		 } else { 
			 return hasElem(actual.getRight(),value); //DE LO CONTRARIO LLAMAMOS RECURS CON EL NODO DEREC DEL NODO ACTUAL COMO EL NUEVO NODO Y EL VALOR QUE BUSCAMOS 
		 } 
	 } else if(actual.getValue()>value) { //SI EL VALOR DEL NODO ES MAYOR QUE EL VALOR QUE BUSCAMOS, SIG QUE EL VALOR QUE BUSCAMOS PUEDE ESTAR DEL LADO IZQ DEL NODO
		 if(actual.getLeft()==null) { //SI EL SUBARBOL IZQ DEL NODO ACTUAL ES NULO SIG QUE ENCONTRAMOS UNA HOJA 
			 return false; 
		 } else { 
			 return hasElem(actual.getLeft(),value); //DE LO CONTRARIO LLAMAMO RECURS AL METODO CON EL NODO IZQ DEL NODO ACTUAL COMO EL UEVO NODO ACTUAL Y EL VALOR QUE BUSCAMOS
		 	}
		 }else{
			 return true; // SI NINGUNA DE LAS CONDICIONES ANTERIOS SE CUMPLES, SIG QUE EL VALOR DEL NODO
		 }				// ACTUAL ES IGUAL AL VALOR QUE ESTAMOS BUSCANDO Y DEVUELVO TRUE
	}
	*/

	public TreeNode getRoot() {
		return root;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public int getHeight() {
		return getHeightRecursive(this.root);
	}

	private int getHeightRecursive(TreeNode nodo) {
		int leftHeight = 0;
		int rightHeight = 0;

		if (nodo.getLeft() != null)
			leftHeight = getHeightRecursive(nodo.getLeft()) + 1;
		if (nodo.getRight() != null)
			rightHeight = getHeightRecursive(nodo.getRight()) + 1;

		if (leftHeight < rightHeight) {
			return rightHeight;
		} else
			return leftHeight;
	}

	public void printPreOrder(TreeNode nodo) {
		if (nodo == null) {
			System.out.println("-");
		} else {
			System.out.println(nodo.getValue());
			printPreOrder(nodo.getLeft());
			printPreOrder(nodo.getRight());
		}
	}

	public void printInOrder(TreeNode nodo) {
		if (nodo == null) {
			System.out.println("-");
		} else {
			printPreOrder(nodo.getLeft());
			System.out.println(nodo.getValue());
			printPreOrder(nodo.getRight());
		}
	}

	public void printPostOrder(TreeNode nodo) {
		if (nodo == null) {
			System.out.println("-");
		} else {
			printPreOrder(nodo.getLeft());
			printPreOrder(nodo.getRight());
			System.out.println(nodo.getValue());
		}
	}

	public List<Integer> getLongestBranch() {
		List<Integer> longestBranch = new ArrayList<>();
		getLongestBranchRecursive(root, longestBranch);
		return longestBranch;
	}

	private void getLongestBranchRecursive(TreeNode nodo, List<Integer> longestBranch) {
		if (nodo == null) {
			return;
		}
		longestBranch.add(nodo.getValue());
		int leftHeight = getHeightRecursive(nodo.getLeft());
		int rightHeight = getHeightRecursive(nodo.getRight());
		if (leftHeight > rightHeight) {
			getLongestBranchRecursive(nodo.getLeft(), longestBranch);
		} else {
			getLongestBranchRecursive(nodo.getRight(), longestBranch);
		}
	}

	public List<Integer> getFrontera() {
		List<Integer> hoja = new ArrayList<>();
		getFronteraRecursive(root, hoja);
		return hoja;
	}

	private void getFronteraRecursive(TreeNode nodo, List<Integer> hoja) {
		if (nodo == null) {
			return;
		}
		if (nodo.getLeft() == null && nodo.getRight() == null) {
			hoja.add(nodo.getValue());
		} else {
			getFronteraRecursive(nodo.getLeft(), hoja);
			getFronteraRecursive(nodo.getRight(), hoja);
		}
	}

	public Integer getMaxElem() {
		if (root == null) {
			return null; // Devuelve null si el árbol está vacío
		}

		TreeNode current = root;
		while (current.getRight() != null) {
			current = current.getRight();
		}
		return current.getValue();
	}
	/*
	public Integer getMaxElem(TreeNode actual) { // EN EL ENUNCIADO NO PONE QUE RECIBE POR PARAMETRO
		if (actual == null) {
			return null; // Devuelve null si el árbol está vacío
		}
		while (actual.getRight() != null) {
			actual = actual.getRight();
		}
		return actual.getValue();
	}
	*/
	// metodo que buca recursivamente los nodos en un nivel espeficico del arbol y
	// agrega sus valores a una lista.
	public List<Integer> getElemAtLevel(int level) {
		List<Integer> elements = new ArrayList<>();
		getElemAtLevel(root, level, elements);
		return elements;
	}

	private void getElemAtLevel(TreeNode node, int level, List<Integer> elements) {
		if (node == null) { // SI ES IGUAL, SIGN QE LLEGAMOS AL FINAL Y NO HAY MAS NODOS
			return;
		}
		if (level == 0) { // SI ES IGUAL, SIGN QE ESTAMOS EN EL NIVEL QUE BUSCAMOS DEL ARBOL, Y AGREGA EL
							// VALOR A LA LISTA
			elements.add(node.getValue());
		} else { // SINO
			getElemAtLevel(node.getLeft(), level - 1, elements); // REALIZA LLAMADA RECURSIVA PARA LOS HIJOS IZQ Y DEREC
																	// DEL NODO, DISMINUYENDO EL NIVEL EN UNO.
			getElemAtLevel(node.getRight(), level - 1, elements); // ESTO CONTINUA HASTA QUE SE ALCANZA EL NIVEL DESEADO
																	// O HASTA QUE SE LLEGA AL FINAL DEL ARBOL
		}
	}

	/*----------------EJERCICIO 2----------------*/

	public int sumaNodosInternos() {
		return sumaNodosInternosRecursiva(root);
	}

	private int sumaNodosInternosRecursiva(TreeNode nodo) {
		int suma = 0;
		if (nodo.getLeft() != null || nodo.getRight() != null) {
			suma = suma + nodo.getValue();
			suma += sumaNodosInternosRecursiva(nodo.getLeft());
			suma += sumaNodosInternosRecursiva(nodo.getRight());
			return suma;
		} else {
			return 0;
		}
	}

	/*----------------EJERCICIO 3 ----------------*/

	public List<Integer> hojasQueSuperanK(int k) {
		List<Integer> hojas = new ArrayList<>();
		hojasQueSuperanKRecursivo(root, k, hojas);
		return hojas;
	}

	private void hojasQueSuperanKRecursivo(TreeNode nodo, int k, List<Integer> hojas) {
		if (nodo == null) {
			return;
		}
		if (nodo.getLeft() == null && nodo.getRight() == null) {
			// Si es una hoja y su valor supera K, la agregamos a la lista
			if (nodo.getValue() > k) {
				hojas.add(nodo.getValue());
			}
		} else {
			// Llamadas recursivas para los hijos izquierdo y derecho
			hojasQueSuperanKRecursivo(nodo.getLeft(), k, hojas);
			hojasQueSuperanKRecursivo(nodo.getRight(), k, hojas);
		}
	}
}
