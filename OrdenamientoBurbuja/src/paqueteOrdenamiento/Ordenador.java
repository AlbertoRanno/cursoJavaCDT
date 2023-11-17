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
		/* Otra forma de ordenar los números dentro de un array */
		int aux, cont1, cont2;

		// La logica aqui es la siguiente:
		// EL for externo, recorre el array, de izquierda a derecha, cont1, es el indice
		// del array
		for (cont1 = 1; cont1 < array.length; cont1++) {
			// cont1 arranca en 1, igual que en el metodo anterior
			aux = array[cont1]; // guardo el valor por si hay que hacer cambios

			// Lo importante viene el for interno, cont2, es el indice anterior a cont1 en
			// el array
			// cont2 tiene que ser mayor a cero, porque no existen indices negativos
			// Y LO QUE VIENE DESPUES DE LA &&, es como si fuera un condicional, es la
			// condicion
			// IMPORTANTE: Si el valor, almacenado en cont2, en mayor al almacenado en cont1
			// (osea, el indice siguiente), cambia sus ubicaciones
			for (cont2 = cont1 - 1; cont2 > 0 && array[cont2] > aux; cont2--) {
				array[cont2 + 1] = array[cont2];
				array[cont2] = aux;
			}

			// Lo importante de esto, es que, mientras el ciclo externo, avanza de izquierda
			// a derecha
			// en el array, si se dan las condiciones del ciclo interno, este avanza de der
			// a izquierda.
			// Por eso el "cont2--", y esto lo hace, para ya directamente insertar ese
			// valor, en el
			// indice que le corresponde. Lo cual es más eficiente que el metodo anterior.

			// en el caso: { 3, 4, 5, 2 }, por ejemplo, una vez que llega a la comparación
			// con el 2,
			// NO corre el al lugar del 2, para luego arrancar comparando de nuevo
			// sino que, empieza comparando de der a izq, hasta ver que iria en el indice 0
		}

	}

	// ORDENAR QUICKSORT:
	// El algoritmo más eficiente para ordenar una secuencia de numeros
	// Explicación gráfica en powerpoint:
	// https://www.youtube.com/watch?v=yXy7WzgUaSA&list=PL602060AB32FC864B&index=24
	// Apuntes de la misma:
	// Se usan 3 variables, puntero izquierdo, derecho, y pivote.
	// Dado un arreglo, por ejemplo: { 4 5 2 3 6 1 }
	// El puntero izquierda empezaria en el 4, el derecho en el 1, y el pivote en 4
	// Como 4, se vuelve el pivote, el p.der. compara el 1 con el 4, al ser menor
	// lo pasa al indice donde estaba el 4,
	// el p.izq. avanza a der, 5 > 4, lo pasa a la derecha
	// el p.der. avanza a izq, 6 > 4, ok, entonces avanza de nuevo a izq,
	// 3 < 4, lo pasa al indice donde estaba el 5
	// avanza el p.izq, 2 < 3, ok, entonces avanza de nuevo a der., llega al índice
	// donde estaba el 3. Avanza el p.der a izq. llega al mismo indice,
	// CUANDO LOS PUNTEROS COINCIDEN, ESE ES EL INDICE DONDE SE UBICA EL PIVOT!!!
	// El 4 ya quedó ordenado, y dividió el array, en otros dos arrays nuevos!
	// Por un lado, los que quedaron a izquierda {1 3 2} y por otro, los que
	// quedaron a derecha {6 5}
	// Ahora, las variables asumen sus nuevas posiciones en el nuevo array de la
	// izq: p.izq = 1 // pivote = 1 // p.der = 2
	// Y SE REPITE EL PROCEDIMIENTO!
	// 1 pivote => p.der 2>1, ok, avanza, 3>1, ok, avanza, se encuentra con p.izq
	// Ergo, esa es la posicion del pivote. (Forma un nuevo arreglo {3,2})
	// Ahora el arreglo {6,5} => p.izq = 6, pivote = 6 , pto derecho = 5
	// COmpara 5 < 6, cambia, avanza p.izq, coinciden posiciones => 6 ordenado
	// IDEM con {3,2}
	// Y todo queda ordenado... aunque suena a más camino, los recursos de la PC,
	// Se distribuyen mejor para hacer esto, por lo que es más eficiente, estimo,
	// porque separa en distintos arrays que puede analizar en paralelo.

	// En código:
	public int[] ordenarQuicksort(int[] array) {
		// de parametro, un arreglo "array", el que voy a pasar para que ordene
		return quicksort1(array);
		// retorna el arreglo ya ordenado al main, para eso, ejecuta quicksort1
	}

	public int[] quicksort1(int numeros[]) {
		// paso nuevamente el arreglo como parametro, pero para insertarlo
		// en otro metodo, que va a depender de otros parametros:
		return quicksort2(numeros, 0, numeros.length - 1);
		// retorna una variable, el arreglo, ya ordenado
		// numeros , corresponde al arreglo
		// 0, corresponde al puntero izquierdo
		// numeros.length - 1, corresponde al puntero derecho
		// (el pivote acá no se elige, pero va a ser igual que el p.izq.
	}

	// En este método comienza el orden:
	public int[] quicksort2(int numeros[], int izq, int der) {
		// Verifico que la izquierda sea menor que la derecha, indicando que hay más de
		// un elemento en el arreglo
		if (izq < der) {
			int i = izq, d = der;
			int pivote = i;
			int aux;

			// Mientras el puntero izquierdo no coincida con el puntero derecho
			while (i < d) {
				// Avanzo el puntero izquierdo mientras el número en esa posición sea menor o
				// igual al pivote (NO HAY CAMBIOS, AVANZO)
				// y el puntero izquierdo sea menor al derecho
				while (numeros[i] <= numeros[pivote] && i < d) {
					i++;
				}

				// Avanzo el puntero derecho mientras el número en esa posición sea mayor al
				// pivote (el p.der avanza hacia la izquirda, por eso el d--)
				// (IDEM - NO HAY CAMBIOS, AVANZO)
				while (numeros[d] > numeros[pivote]) {
					d--;
				}

				// Si los punteros aún no coinciden en la misma posición, realizo el intercambio
				// de valores
				if (i < d) {
					aux = numeros[i];
					numeros[i] = numeros[d];
					numeros[d] = aux;
				}
			}

			/* (**VER AL PIE**)
			 * Este bloque que sigue ocurre después de que los punteros izquierdo (i) y derecho
			 * (d) se han cruzado, indicando que el pivote ha encontrado su posición final
			 * en el arreglo.
			 */

			aux = numeros[pivote]; // Guardo el valor del pivote en una variable auxiliar
			numeros[pivote] = numeros[d]; // Asigno al pivote el valor que está en la posición del puntero derecho
			numeros[d] = aux; // Asigno al puntero derecho el valor original del pivote

			// Llamadas recursivas para ordenar las subsecciones del arreglo
			// Ahora que el pivote está en su posición final, divido el arreglo en dos
			// subarreglos
			// Uno a la izquierda del pivote y otro a la derecha del pivote. Luego, llamo
			// recursivamente
			// al algoritmo Quicksort para ordenar cada subarreglo.

			quicksort2(numeros, izq, d - 1); // Llamo recursivamente para ordenar la subsección a la izquierda del
												// pivote
			quicksort2(numeros, d + 1, der); // Llamo recursivamente para ordenar la subsección a la derecha del pivote

		}

		// Retorno el arreglo ordenado
		return numeros;
	}

	/*
	 * NOTA PIE* Cuando se menciona que los punteros izquierdo (i) y derecho (d) han
	 * cruzado, se refiere al momento en que el puntero izquierdo (i) alcanza o
	 * supera al puntero derecho (d) durante la fase de particionado en el algoritmo
	 * Quicksort.
	 * 
	 * En el algoritmo Quicksort, se utilizan dos punteros (i y d) que avanzan hacia
	 * el centro del arreglo desde los extremos opuestos. El puntero izquierdo (i)
	 * se mueve hacia la derecha, mientras que el puntero derecho (d) se mueve hacia
	 * la izquierda. El objetivo es encontrar un par de elementos que estén en la
	 * posición incorrecta con respecto al pivote y intercambiarlos.
	 * 
	 * Cuando los punteros izquierdo (i) y derecho (d) se cruzan, significa que han
	 * recorrido todo el arreglo y no hay más elementos que comparar. En este punto,
	 * el pivote ha encontrado su posición final, y todos los elementos a su
	 * izquierda son menores o iguales, y todos los elementos a su derecha son
	 * mayores o iguales (dependiendo del orden ascendente o descendente).
	 * 
	 * 
	 * 
	 * Luego, se procede a llamar recursivamente el algoritmo Quicksort para ordenar
	 * las subsecciones a la izquierda y a la derecha del pivote.
	 */

}
