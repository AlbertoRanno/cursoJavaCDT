package paquete;

import java.io.*; //Tipear para capturar info del teclado

public class Main {
	/*
	 * leer desde el teclado / concat() / toUpperCase() - toLowerCase() / length() /
	 * Convertir variables numéricas a Strings y viceversa
	 */
	public static void main(String[] args) {
		String texto = "", texto2 = "", texto3 = "", texto4 = "", texto5 = "";

		System.out.println("Escribe algo en consola y luego presiona Enter");
		// Declaro un objeto específico: - abro un canal que recibe datos desde el
		// exterior
		InputStreamReader in = new InputStreamReader(System.in);
		// También necesito al siguiente objeto específico para guardar en las variables
		// respectivas esos
		// datos que recibe el canal desde el exterior
		BufferedReader buffer = new BufferedReader(in);

		// Dado que pueden venir errores de escrituras desde el teclado utilizo la
		// estructura:
		/*
		 * try {
		 * 
		 * }catch(IOException e) {
		 * 
		 * }
		 */

		try {
			texto = buffer.readLine(); // Captura en la variable lo que escribo en teclado
		} catch (IOException e) {
		}

		System.out.println(texto);

		// Concat() - Añadir caracteres a una variable String

		texto = texto.concat("-Esto es uNa concatenacion");
		System.out.println(texto);

		// toUpperCase() - toLowerCase()
		texto = texto.toLowerCase();
		System.out.println(texto);
		texto = texto.toUpperCase();
		System.out.println(texto);

		// Length() - cuantos caracteres tiene
		int cantidadCaracteres = texto.length();
		System.out.println(
				"La frase tiene " + cantidadCaracteres + " caracteres. Logicamente cuentan los espacios en blanco.");

		// Vuelvo a invocar carga de info mediante el teclado:
		System.out.println(
				"Escriba un nuevo texto (\"texto2\") el cual será almacenado en otra celda de memoria (\"buffer2\") ");
		// NO necesito un nuevo objeto: BufferedReader buffer2 = new BufferedReader(in);
		// para almacenar lo nuevo que escriba. NO lo necesito!
		// Dado que la funcionalidad se necesita una sola vez, y luego se guarda
		// distinto contenido en distintas variables. Es decir, vuelvo a usar
		// "buffer".readLine()
		try {
			texto2 = buffer.readLine();
		} catch (IOException e) {
		}
		System.out.println("Este es el nuevo texto =" + texto2);
		System.out.println("Este es el texto anterior =" + texto);

		// Convertir Strings a numero
		System.out.println(
				"Ingrese un numero (a priori lo tomaría a string) convertido a Integer con el que puede calcular: ");
		int versionEnNumero = 0;

		try {
			texto3 = buffer.readLine();
			versionEnNumero = Integer.parseInt(texto3);
		} catch (Exception e) { // OJO - CAMBIO DE IOException a solo Exception
			System.out.println("Debes ingresar un numero. Sin este catch, daría el error de consola");
		}
		System.out.println(versionEnNumero);
		System.out.println(versionEnNumero + 10);

		System.out.println("AHora pasaré el string a Double");
		double versionNroDouble = 0;

		try {
			texto4 = buffer.readLine();
			versionNroDouble = Double.parseDouble(texto4);
		} catch (Exception e) {
			System.out.println("Ya te había anticipado que usaras un número cierto??");
		}
		System.out.println(versionNroDouble + 0.5);

		// Convertir número a String
		double numeroQuePasaraAString = 50.3;
		texto5 = String.valueOf(numeroQuePasaraAString); //Ver entre todos los metodos, cual convierte desde Double!
		texto5 = texto5.concat("-Double (Concateno para Verificar que es String");
		System.out.println(texto5);

	}
}