package paqueteTextos;

import java.io.*; //1ro importar Librería para la lectura (y tambien sirve para la escritura) de archivos

public class Textos {

	public void leer(String nombreArchivo) {

		try { // 2do abrir un try - catch por los posibles errores, como no encontrar el
				// archivo
				// 3ro- Utilizar la clase FileReader, la cual se utiliza para leer archivos
			FileReader r = new FileReader(nombreArchivo);
			// 4to- Y, al igual que en el proyecto VariablesDeTexto, también necesito al
			// siguiente objeto específico para guardar en las variables
			// respectivas esos datos que recibe el canal desde el exterior, en este caso,
			// desde el archivo
			// Es un espacio en memoria para guardad info
			BufferedReader buffer = new BufferedReader(r); // En el buffer se guarda la info de (r), la del archivo
			/*
			 * System.out.println(buffer.readLine()); // Muestra "Primer linea del texto"
			 * System.out.println(buffer.readLine()); // Muestra "Segunda linea"
			 * System.out.println(buffer.readLine()); // Muestra "Tercera linea"
			 */
			// Esto sucede porque el buffer obtine una linea a la vez. Lee la primera, y se
			// queda esperando al comienzo de la 2da
			// Esto se corrige con un ciclo

			String temp = ""; // variable temporal, inicializada
			// Importante, al estar así declarada NO es una variable nula, existe. Aunque
			// esté vacía

			while (temp != null) { // Como no es nula, sino vacia, se va a cumplir
				temp = buffer.readLine(); // y va a leer linea por linea
				if (temp == null) { // hasta que la variable se vuelva nula = no hay mas texto
					break; // ahi saldria del ciclo
				}
				System.out.println(temp);
				// Tener en cuenta que podría ir concatenando, o haciendo lo que guste para
				// presentarlo
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		;

	}
}