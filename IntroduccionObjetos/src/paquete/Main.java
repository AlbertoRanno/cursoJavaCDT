package paquete;

public class Main {

	// Ctrl + Espacio y tipeo "main", como atajo para el método:

	public static void main(String[] args) {
		// Ojo, cuando quiera ejecutar una clase, que necesito este método para que
		// eclipse lo tome como punto de partida para empezar a ejecutar
		// Defino un nuevo objeto, basado en la clase (plantilla) Carro
		Carro viejo = new Carro(); // Es como una variable, notar que el Tipo, sería Carro
		viejo.mostrarCaracteristicas();
		viejo.estado();
		viejo.encender();
		viejo.estado();
		System.out.println(viejo.altura);

		// Ctrl + Mayus + F = Format

		CarroBMW bmw = new CarroBMW();
		bmw.mostrarCaracteristicas(); // Heredada
		bmw.turbo(); // Nativa de BMW - no funciona en Toyota (el otro hijo)
		bmw.estado();
		bmw.encender();
		bmw.estado();

		CarroToyota toyota = new CarroToyota();
		toyota.mostrarCaracteristicas(); // Heredada
		System.out.println(toyota.modelo()); // Nativa de Toyota - no funciona en bmw

		CarritoToyotita toyotita = new CarritoToyotita();
		toyotita.mostrarCaracteristicas(); // Heredada de CArro
		System.out.println(toyotita.modelo()); // Heredada de CarroTOyota

		/*
		 * El polimorfismo es una de las características clave de la programación
		 * orientada a objetos (POO) en Java. La idea es que puedes tratar objetos de
		 * diferentes clases de manera uniforme si comparten una interfaz común. Ejemplo:
		 */
		viejo.informacion();
		bmw.informacion();
		toyota.informacion();
		toyotita.informacion();
	}

}
