package paqueteColas;

import java.util.LinkedList; // importo al igual que para las listas
//No hay una clase "Cola", pero se pueden usar importando esta

public class Cola {

	public static void main(String[] args) {
		// SOn otro tipo de listas enlazadas (LinkedList)
		// También se pueden guardar cualquier tipo de datos (Nros, arreglos, objetos, 
		// A diferencia de las Pilas, se basan en FIFO
		// first-in, first-out
		// Se introducen los datos en cierto orden, y solo se obtiene el primero que fue
		// introducido
		// (al contrario de las pilas)

		// Y sus metodos son:
		// offer = similar al push - agrega
		// poll = similar al pop - extrae
		// peek - muestra el ultimo sin eliminarlo (IGUAL PILA)

		// Declaro un nuevo elemento "cola"
		LinkedList cola = new LinkedList();

		// Guardo en ella los nros del 1 al 10
		for (int i = 1; i < 11; i++) {
			cola.offer(i); // agrego
		}

		while (cola.peek() != null) { // Mientras el ultimo elemento (no elimina), sea distinto de nulo...
			System.out.println(cola.poll()); // extraelo, y anda mostrando cual es ese elemento
			// Extrae primero el 1, luego el 2... (a diferencia de la pila...)
		}
	}

}
