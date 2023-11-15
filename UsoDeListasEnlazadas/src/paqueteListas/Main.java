package paqueteListas;

import java.util.LinkedList; //1ero importo

public class Main {

	public static void main(String[] args) {
		// No como hacer una lista enlazada desde cero, sino como usarlas...
		
		//Es un objeto que permite guardar una infinidad de datos, el límite lo pondrá la capacidad de la pc.
		//A diferencia de los arreglos donde se setea la cantidad de elementos, y el tipo a priori, acá no
		LinkedList lista = new LinkedList();

		//El metodo "add" añade un objeto, puede ser de cualquier tipo, ejemplo, string, number, boolean, ...
		lista.add("Palabra"); //Se guarda en el primer índice disponible, como estaba vacío en el cero
		lista.add(true); //Este se desplaza al índice 2, porque se pasa al siguiente índice disponible
		lista.add(1, 17); // ELijo en el índice que quiero que se agregue
		lista.addFirst(18);//Para añadir al principio
		lista.addLast(55);//Añade al final
		lista.add("palabra2");
		
		lista.remove(0); //Quita el valor en el indice especificado- Cambia el tamaño y se desplazan los valores de los índices
		//quita el addFIrst 18
		lista.removeLast(); //quita el palabra2, que se agrega post addLast55
		
		System.out.println("El tamaño de la lista es : " + lista.size()); //Metodo para obterner tamaño
		System.out.println(lista.get(0)); //Metodo para obtener valor dado el indice
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(lista.size()-1)); //último
		System.out.println(lista.getLast()); //último
		System.out.println(lista.get(3));
		//System.out.println(lista.get(4));
		//System.out.println(lista.get(5));
		

	}

}
