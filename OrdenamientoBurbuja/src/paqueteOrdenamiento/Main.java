package paqueteOrdenamiento;

public class Main {

	public static void main(String[] args) {
		int[] arreglo = { 5, -3, 4, 2, 2, 5800, -3666456, 6565, 65325, 333, -2, 55, -333, 3, 0 };
		// Para usarlo, creo un objeto de la clase Ordenador
		Ordenador objeto = new Ordenador();

		System.out.println("Antes de ordenar:");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
		System.out.println(); // Imprimir una línea en blanco

		// objeto.ordenamientoBurbuja(arreglo); // El más sencillo, pero menos eficiente
		// objeto.ordenarInsercion(arreglo); // Lo va a ordenar igual, pero + eficiente
		objeto.ordenarQuicksort(arreglo); // es el más eficiente de todos
		// El más complejo, usa recursividad, pero se han hecho pruebas, y
		// ha demostrado ser más rápido, por ende es el que más se usa

		System.out.println("Después de ordenar:");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}
	}

}
