package paqueteOrdenamiento;

public class Ordenador {

	public void ordenamientoBurbuja(int[] array) {

		// El algoritmo de ordenamiento Burbuja, sirve para ordenar los números (int,
		// double, etc... ) dentro de un arreglo

		// Por ejemplo: int[] arreglo = { 5, 3, 4, 2 };
		// Lo que va a hacer el algoritmo, es ir recorriendo, y comparando,
		// y en base a eso, los cambios que hará. Partiendo del:
		// 5,3,4,2
		// arranca asi, y compara,5 > 3, entonces, pasa el 3 a la posicion (indice), que
		// estaba el 5, luego compara el 5 > 4, entonces pasa el 4 al indice donde
		// estaba el 5, luego compara 5 > 2, y cambia hasta quedar:
		// 3,4,2,5 (***)
		// ahora arranca de nuevo, 3 < 4, ok, 4 > 2, cambia... 4 < 5, ok, queda:
		// 3,2,4,5
		// - arranca de nuevo 3 > 2, cambia, resto ok, queda:
		// 2,3,4,5 - termina.
		// Esto en código, se podría hacer así:

		int aux; // mismo artilugio que para fibonacci
		boolean cambios = false; // para registrar cuando la revisión arroja que algo hay que modificar

		while (true) { // ciclo infito, que luego frenaré con un break

			cambios = false; // (*****) - A priori, revisa, no cambia nada, hasta que encuentra alguna
								// diferencia, cuando ya no haya, sale

			for (int i = 1; i < array.length; i++) { // cada ciclo for, recorre el array, 1 vez, y lleva al final, al
														// nro, más grande
				// es decir, equivale a una linea de esto (***)

				if (array[i] < array[i - 1]) {
					aux = array[i]; // lo guardo porque despues lo voy a necesitar
					// Reasigno valores en los indices
					array[i] = array[i - 1];
					array[i - 1] = aux; // no puedo usar array[i] porque en la linea anterior cambie su valor
					cambios = true; // porque realiza un cambio, cuando deje de realizarlos, saldré de los bucles
									// (*****)
				}

			}

			if (cambios == false) {
				break;
			} // Si luego del ciclo, cambios sigue en false, salgo.
		}
	}

	/*
	 * En Eclipse puedes cambiar el nombre de una clase que ya tiene métodos dentro.
	 * Puedes seguir estos pasos: Haz clic derecho sobre el nombre de la clase en el
	 * Explorador de Proyectos (Package Explorer). Selecciona la opción "Refactor"
	 * en el menú contextual. En el submenú de "Refactor", elige "Rename" (Cambiar
	 * nombre) o utiliza el atajo de teclado (generalmente Alt + Shift + R). Ingresa
	 * el nuevo nombre para la clase y presiona Enter. Eclipse se encargará de
	 * realizar los cambios necesarios en todos los lugares donde se hace referencia
	 * a la clase,
	 */

	public void ordenarInsercion(int[] array) {
		/* Otra forma de ordenar los números dentro de un array*/
		int aux, cont1, cont2;

		// La logica aqui es la siguiente:
		// EL for externo, recorre el array, de izquierda a derecha, cont1, es el indice del array
		for (cont1 = 1; cont1 < array.length; cont1++) { 
			//cont1 arranca en 1, igual que en el metodo anterior
			aux = array[cont1]; //guardo el valor por si hay que hacer cambios
			
			// Lo importante viene el for interno, cont2, es el indice anterior a cont1 en el array
			// cont2 tiene que ser mayor a cero, porque no existen indices negativos
			// Y LO QUE VIENE DESPUES DE LA &&, es como si fuera un condicional, es la condicion
			// IMPORTANTE: Si el valor, almacenado en cont2, en mayor al almacenado en cont1
			// (osea, el indice siguiente), cambia sus ubicaciones
			for (cont2 = cont1 - 1; cont2 > 0 && array[cont2] > aux; cont2--) {
				array[cont2 + 1] = array[cont2];
				array[cont2] = aux;
			}

			// Lo importante de esto, es que, mientras el ciclo externo, avanza de izquierda a derecha
			// en el array, si se dan las condiciones del ciclo interno, este avanza de der a izquierda.
			// Por eso el "cont2--", y esto lo hace, para ya directamente insertar ese valor, en el
			// indice que le corresponde. Lo cual es más eficiente que el metodo anterior.
			
			// en el caso: { 3, 4, 5, 2 }, por ejemplo, una vez que llega a la comparación con el 2,
			// NO corre el  al lugar del 2, para luego arrancar comparando de nuevo
			// sino que, empieza comparando de der a izq, hasta ver que iria en el indice 0
		}

	}

}
