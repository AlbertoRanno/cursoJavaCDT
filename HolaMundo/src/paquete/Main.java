package paquete;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		// Lo primero de todo el el código que se va ejecutar, es este método

		/*
		 * *Los proyectos crearlos no muy lejos de la raíz del disco “sino pueden fallar
		 * por la cantidad de niveles (subcarpetas)” Click derecho en Source packages,
		 * para crear una clase. Buena práctica PascalCase para nombres de clases Buena
		 * práctica camelCase para nombres de variables public porque es una clase que
		 * vamos a acceder de manera pública
		 */

		// Se recomiendo no utilizar acentos, NI EN LOS COMENTARIOS, dado que pueden
		// provocar problemas al guardar el codigo, o para levantarlo desde otras
		// herramientas

		/*
		 * Compilación: para correrlo por fuera del programa File - Export - Runnable
		 * JAR file - Next - Seleccionar la clase principal (Main) - Tildar => Extraer
		 * las librerías requeridas en el archivo JAR generado - Terminar Luego en el
		 * directorio del archivo, abrir CMD - presiono: dir java -jar
		 * nombreDelArchivo.jar Enter y debería Ejecutarse
		 */

		/*
		 * Tipos de datos: Primitivos: -Enteros y -Flotantes
		 * 
		 * Referenciados (Tipo Object): (ej. string) -Clases -Interfases -Arrays
		 * 
		 * short - int - long (enteros) float - double (flotantes - decimales) byte
		 * (memoria pc) char (caracteres del 0 al 255) boolean (verdaderos o falsos)
		 * String (cadenas de texto) + - * % /
		 */

		/*
		 * % = Residuo, Módulo, o Resto: es el sobrante de dividir un número por otro.
		 * Considerando la división ENTERA entre los números, por eso, el Resto de 5
		 * Float, divido 2, sigue siendo 1 (y no 0)
		 */

		/*
		 * Reglas para nombres de variables: camelCase no puede tener delante numeros o
		 * caracteres especiales - salvo "_guionBajo" y "$dineroAhorrado" los acentos en
		 * las nombres están permitidos, pero no es recomendable
		 */

		int variable1; // Una variable que fue definida dentro de un método (main en este caso), no
						// podrá ser utilizada fuera de ese método. Ese es su alcance.
		variable1 = 5; // Literal - viene con su tipo de dato. EN base a ella, en las variables
						// definidas por var, se infiere el tipo de dato.
		// En este caso es INT por default
		System.out.println(variable1);
		// Escribe "sysout" y presiona Ctrl + Espacio + ENter. Eclipse autocompletará
		// "System.out.println();".
		int resultado;
		resultado = variable1 + 2;
		System.out.println("El resultado es: " + resultado);
		System.out.println("Suma: la variable1 + 2 = " + (variable1 + 2));
		System.out.println("Resta: la variable1 - 2 = " + (variable1 - 2));
		System.out.println("Multipliación: la variable1 * 2 = " + (variable1 * 2));
		System.out
				.println("División: la variable1 / 2 = " + (variable1 / 2) + " (Recordar que estoy operando enteros)");
		System.out.println("Residuo: la variable1 % 2 = " + (variable1 % 2));
		/*
		 * Atajo para buscar definiciones y referencias: Puedes seleccionar una variable
		 * o método, luego presionar F3 para ir a su definición o Ctrl + G para buscar
		 * todas las referencias en el proyecto.
		 */
		float variable2 = 5;
		System.out.println("División: la variable2 / 2 = " + (variable2 / 2) + " (Ahora estoy operando flotantes)");
		System.out.println("Residuo: la variable2 % 2 = " + (variable2 % 2)
				+ " (El Residuo, por definición, lógicamente sigue siendo 1)");

		// si declaro ahora una variable del tipo string, String va con mayúscula por
		// tratarse de un tipo de dato Referenciado (y no primitivo como int)
		String saludo = "Hola!";
		// las literales toman sentido, porque a partir de la version 10 de JAVA, se usa
		// la palabra reservada var, para inferir el tipo de dato a partir de la literal
		System.out.println(saludo);
		short suma = 3 + 10;
		System.out.println(suma);
		int resta = 8 - 17;
		System.out.println(resta);
		long residuo = 9 % 2;
		System.out.println(residuo);
		float multiplicacion = 2 * (15 * (-2));
		System.out.println(multiplicacion);
		double division = 10 / 3.4;
		System.out.println(division);

		/*
		 * OJO, es como .NET , y no como JS, importa el orden con que se definen las
		 * variables! Lo siguiente da error!
		 * 
		 * String color; System.out.println(color); color = "Rojo";
		 * 
		 * ¡Correcto! En el momento en que se imprime la variable, no se ha asignado aún
		 * un valor a la variable y el compilador manda el error: variable color might
		 * not have been initialized (la variable color tal vez no ha sido
		 * inicializada)«
		 */

		// Operandos lógicos < > =< => == || && !
		int var = 5; // asigno valor
		boolean condicion; // defino variable
		if (!(var != 5) && (var < 6)) {
			condicion = true;
		} else {
			condicion = false;
		}

		if (condicion) {
			System.out.println("Verdadero");
		} else {
			System.out.println("Falso");
		}

		// Ciclos
		for (int contador = 0; contador <= 5; contador++) {
			System.out.println(contador);
		}
		for (int contador = 4; contador >= 0; contador--) {
			System.out.println(contador);
		}
		for (int contador = 1; contador <= 20; contador++) {
			contador = contador * 2;
			System.out.println("Contador vale = " + contador);
		}
		/*
		 * contador = 1 es < 20 contador = 1*2 = 2 2+1 es <20 contador = 3*2 = 6 6+1 es
		 * <20 contador = 7*2 = 14 14+1 es <20 contador = 15*2 = 30 30+1 ya NO es < 20
		 * => FIN del ciclo
		 */

		int x = 0;
		while (x <= 10) {
			System.out.println("El valor de x es: " + x);
			x = x + 2;
		}
		/*
		 * se imprime x = 0 0 + 2 = 2 2 <= 10 se imprime x = 2 ... 8 + 2 = 10 10 <= 10
		 * se imprime x = 10 10 + 2 = 12 ya NO es <= 10 => FIN del ciclo
		 */

		boolean condicion2 = true;
		int y = 0;
		while (condicion2) {
			System.out.println("El valor de y es: " + y);
			y = y + 2;

			if (y >= 8) {
				condicion2 = false;
			}
		}

		// break; => salirse de un ciclo - Se suelen usar dentro de los condicionales
		for (int i = 0; i <= 10; i++) {
			System.out.println("Aún estás en el ciclo");
			if (i == 4) {
				break;
			}
			System.out.println("El valor de i es :" + i);
		}
		System.out.println("Haz salido del ciclo");

		// continue; => no salgo por completo del ciclo, más bien, salteo determinadas
		// condiciones
		for (int i = 0; i <= 10; i++) {
			System.out.println("Aún estás en el ciclo");
			if (i == 4) {
				continue;
			}
			System.out.println("El valor de i es :" + i);
		}
		System.out.println("Haz salido del ciclo");

		// Tutorial 7: Ciclos, Serie de números impares, y Fibonacci (0...
		// 1,1,2,3,5,8,11,... - la suma de los 2nros previos)
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		// Fibonacci
		int nroActualSerie = 1; // Considero el primer nro, el 1, y no el 0
		int nroAnteriorSerie = 0;
		int temporal;

		while (true) {
			System.out.println(nroActualSerie);
			temporal = nroActualSerie;
			nroActualSerie = nroActualSerie + nroAnteriorSerie;
			nroAnteriorSerie = temporal;
			if (nroActualSerie > 30) // Punto arbitrario para detener el programa
			{
				break;
			}
		}
		/*
		 * imprimo 1 temporal toma el valor de 1 el actual, toma el valor de 1 + 0 el
		 * anterior, pasa a valer, lo que valía el actual (anterior = 1) imprimo 1
		 * temportal toma el valor de 1 actual toma el valor de 1 + 1 anterior toma el
		 * valor de 1 imprimo 2 temporal toma el valor de 2 el actual, toma el valor de
		 * 2 + 1 ...
		 */

		// Tutorial 8 switch
		int z = 'a'; // Distingue de Mayusculas y minusculas
		switch (z) {
		case 'a': {
			System.out.println("Esta es la opción a");
			break; // sin el break, sigue ejecutando el siguiente codigo
		}
		case 'b': {
			System.out.println("Esta es la opción b");
			break;
		}
		default: // se ejecuta si no corresponde ninguna de las opciones anteriores
		{
			System.out.println("Esta opción es la opción por defecto");
		}
		}

		/* Caracteres especiales */
		var nombre = "Karla";

		System.out.println("Nueva linea: \n" + nombre);
		System.out.println("Nueva linea: \t " + nombre);
		// System.out.println("Nueva linea: \b " + nombre); // Retroceso, se come el
		// espacio del caracter anterior, en este caso el espacio en blanco anterior
		// System.out.println("Nueva linea: \b\b\b " + nombre);
		System.out.println("Nueva linea: \'" + nombre + "\'"); // La \ podria o no ser requerida
		System.out.println("Nueva linea: \"" + nombre + "\"");

		/*
		 * Uso de la Clase Scanner
		 *********** 
		 * IMPORTANTE***********
		 * 
		 * Es como el console.ReadLine() de .Net Es una clase predefina en Java que
		 * necesito importar, para eso, hacer click en la lamparita que aparece entre
		 * los nros de las lineas de codigo, y ponerle que la agregue. Va a aparecer
		 * import java.util.Scanner; arriba de la clase en la que estoy trabajando Este
		 * tema se explicara mas adelante, pero necesitaba mecharlo, para incluir
		 * comandos de consola:
		 */
		System.out.println("\t Escribe tu nombre. \n Presiona Enter para terminar.");
		Scanner consola = new Scanner(System.in);
		var usuario = consola.nextLine(); // Este metodo leera toda la siguiente linea de consola, hasta que el usuario
											// pulse Enter

		System.out.println("usuario = " + usuario);

		System.out.println("Escribe tu cargo:");
		var cargo = consola.nextLine();

		System.out.println(usuario + " tiene el cargo de " + cargo);

		/*
		 * Se solicita incluir la siguiente información acerca de un libro:
		 * 
		 * titulo autor
		 * 
		 * Debes imprimir la información en el siguiente formato:
		 * 
		 * Proporciona el titulo: Proporciona el autor: <titulo> fue escrito por <autor>
		 * 
		 * Preguntas de esta tarea ¿Cuál es el código del requerimiento solicitado?
		 */

		System.out.println("Proporciona el titulo:");
		var tituloLibro = consola.nextLine();
		System.out.println("Proporciona el autor:");
		var autorLibro = consola.nextLine();
		System.out.println(tituloLibro + " fue escrito por " + autorLibro);

		/*
		 * En limpio: import java.util.Scanner;
		 * 
		 * public class Main { public static void main(String[] args) { Scanner scanner
		 * = new Scanner(System.in); // Escribe tu solucion aqui
		 * System.out.println("Proporciona el titulo:"); String titulo =
		 * scanner.nextLine(); System.out.println("Proporciona el autor:"); String autor
		 * = scanner.nextLine(); System.out.println(titulo + " fue escrito por " +
		 * autor); } }
		 */

		// Tutorial 9 Arrays... tipo para guardar mas de un dato

		int array[]; // array de tipo enteros
		array = new int[10]; // [Aqui va la dimension - es decir, la cantidad de variables que quiero
								// almacenar]
		array[0] = 10; // recordar que el índice siempre comienza en 0
		array[1] = 2;
		array[2] = 0;
		array[3] = 1;
		array[4] = 120;
		array[5] = 36;
		array[6] = 13;
		array[7] = 25;
		array[8] = 35;
		array[9] = 169; // y recordar que el índice siempre termina 1 antes que la dimensión, por
						// arrancar desde el cero
		// array[10] = 10; de ponerlo, tira error

		// la otra forma:
		int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/*
		 * System.out.println(array); System.out.println(array2);
		 * 
		 * El código crea dos arrays de enteros en Java y luego intenta imprimirlos. La
		 * razón por la que obtienes salidas como [I@511baa65 y [I@340f438e es porque
		 * estás tratando de imprimir directamente el objeto de matriz en lugar de
		 * imprimir sus elementos individualmente. Cuando imprimes un objeto de matriz
		 * en Java utilizando System.out.println(array), obtienes una cadena que
		 * representa la clase de objeto ([I para un array de enteros) seguida de un
		 * símbolo @ y una identificación única de objeto en memoria.
		 * 
		 * Para imprimir los elementos del array y ver los valores que has asignado,
		 * necesitas recorrer el array y mostrar cada elemento individualmente. Podrías
		 * hacerlo de la siguiente manera:
		 */

		for (int i = 0; i < array.length; i++) { // length da la dimension
			System.out.println("Elemento en el índice " + i + ": " + array[i]);
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Elemento en el índice " + i + ": " + array2[i]);
		}

		// En curso YOUTUBE, sigue con Tutorial 10 - Matrices - Arreglos Bidimensionales
		// En curso UDEMY, sigue con Lección 4 - Tipos de datos
	}

}
