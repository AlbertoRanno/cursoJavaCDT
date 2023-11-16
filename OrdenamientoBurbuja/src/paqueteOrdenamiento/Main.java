package paqueteOrdenamiento;

public class Main {

	public static void main(String[] args) {

		int[] arreglo = { 5, -3, 4, 2, 2, 5800, 6565, 65325, 333, -2, 55, -333, 3, 0 };
		// Para usarlo, creo un objeto de la clase OrdenamientoBurbuja
		Ordenador objeto = new Ordenador();
		//objeto.ordenamientoBurbuja(arreglo);
		objeto.ordenarInsercion(arreglo); // Lo va a ordenar de igual forma, pero más eficiente

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		

	}

}
