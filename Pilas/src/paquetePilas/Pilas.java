package paquetePilas;

import java.util.Stack; //Necesario para trabajar con la clase PILAS (STACKS)						

public class Pilas {

	public static void main(String[] args) {
		// Una PIla o Stack, es un espacio en memoria, donde voy a guardar informacion,
		// Se introducen los datos en cierto orden, y solo se obtiene el ultimo que fue introducido
		
		// utilizando principalmente sus 4 metodos nativos:
		// push - agrega a lo último
		// peek - muestra el ultimo sin eliminarlo
		// pop - obtiene el ultimo, eliminandolo de la pila
		// empty - se utiliza para reconocer si la pila tiene o no, datos dentro

		// Las pilas se manejan como un objeto, donde la informacion entra con cierta
		// logica, la cual es: " El primero en entrar, es el ultimo en salir"
		// FILO first-in, last-out -

		// Defino una nueva pila:
		Stack pila = new Stack();
		pila.push(50); // es el primero que agrego, entonces lo agrega al indice 0
		pila.push("Puedo agregar strings también"); // puede tener distintos tipos de datos
		pila.push("puede tener objetos tambien dentro, probar luego ");
		pila.push(17);
		pila.push("ultimo agregado");

		System.out.println("El último elemento en la pila es: " + pila.peek() + "\n");

		System.out.println("Muestro todo el contenido, a la vez que vacío la pila: ");
		while (pila.empty() == false) {
			// Hacer, mientras la pila NO esté vacia
			System.out.println("* " + pila.pop());
		}

	}

}
