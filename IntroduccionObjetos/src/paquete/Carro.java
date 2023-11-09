package paquete;

public class Carro { // Por convención los nombres de clase van con Mayúsuclas

	// UNa clase, es una plantilla, que puede tener variables, a modo de propiedades

	// Variables nativas de la clase
	double peso, altura, ancho, largo;
	int numeroPuertas;
	String modelo;
	boolean encendido;

	// también tiene constructores, que permiten construir los objetos, a partir de
	// las clases

	// Constructores
	public Carro() { // Constructor, sin Argumentos, establece los valores default de las variables
		this.peso = 1000;
		this.altura = 1.1;
		this.ancho = 1.5;
		this.largo = 4.3;
		this.numeroPuertas = 3;
		this.modelo = "Fiat Uno SCR";
		this.encendido = false;
		// Los valores que no detallen se tomaran como null, false o cero,...
		// dependiendo el
		// tipo de dato.
		// puedo omitir el uso de "this.", pero es buena práctica usarlo
	}

	public Carro(double peso, double altura, double ancho, double largo, int numeroPuertas, String modelo) {
		// Constructor, con argumentos, permite cambiar los valores default de las
		// variables o propiedades de la clase
		// Ver que incluso el color ayuda a entender, que lo que se pasa como argumento,
		// actualiza el valor de la propiedad
		// SOn variables diferentes
		this.peso = peso;
		this.altura = altura;
		this.ancho = ancho;
		this.largo = largo;
		this.numeroPuertas = numeroPuertas;
		this.modelo = modelo;
	}

	// Luego de las propiedades, y constructores, vienen los métodos. Que son una
	// especie de funcion, que ejecutan codigo para lograr algo

	// Métodos
	public double obtenerLargo() { // Notar que especifica el tipo de dato
		return this.largo; // Devuelve un valor puntual
	}

	public void mostrarCaracteristicas() {
		// Los métodos del tipo VOID (vacío) son para ejecute varias lineas de codigo,
		// como definir variables nuevas o imprimir en consola. SOn los que más se usan
		System.out.println("\n Las características del auto son las siguientes:\n\t-Peso = " + this.peso
				+ " Kgs\n\t-Alto = " + this.altura + " mtrs\t\t-Ancho = " + this.ancho + " mtrs\t\t-Largo = "
				+ this.largo + " mtrs\n\tCon " + numeroPuertas + " puertas\n\tModelo = " + modelo);
	}

	public void encender() {
		this.encendido = true;
		System.out.println("Enciendo el auto");
	}

	public void apagar() {
		this.encendido = false;
		System.out.println("El auto está detenido");
	}

	public void estado() {
		if (this.encendido) {
			System.out.println("El auto está encendido");
		} else {
			System.out.println("El auto está detenido");
		}
	}

	public void informacion() {
		System.out.println("Este es un auto cualquiera");
	}

}

// Herencia en POO - Las clases pueden tener hijos que toman sus características (Propiedades - Metodos)
//Cada clase puede tener solo un padre

class CarroBMW extends Carro { // Esta nueva clase, es una especio de hijo de la Clase Carro (Padre), la cual
								// le extiende sus características
	// COmprendiendo que, es un Carro diferente, y todo CarroBMW es un carro, pero
	// no todo CArro es CArroBMW
	public CarroBMW() { // COnstructor
		this.modelo = "BMW"; // Hereda el resto de las características! Reutilizo el código, de ahí la
								// ventaja
	}

	public void turbo() {
		System.out.println("Acabas de viajar a 100 millas por hora!");
	}

	public void informacion() {
		System.out.println("Este es un BMW");
	}
}

class CarroToyota extends Carro {
	public CarroToyota() {
		this.modelo = "Toyota";
	}

	public String modelo() {
		return this.modelo;
	}

	public void informacion() {
		System.out.println("Este es un Toyota");
	}

}

//Incluso de una clase que ya es hijo, puede tener otro hijo, y CarritoToyotita heredaría de CarroTOyota y de CArro
class CarritoToyotita extends CarroToyota {
	public CarritoToyotita() {
		this.numeroPuertas = 2;
		this.altura = 0.5;
	}

	public void informacion() {
		System.out.println("Este es una versión extraña de un Toyota");
	}
}

/*
 * Poliformismo - Caracteristicas de POO Estable que una clase, y sus hijos,
 * pueden tener cada una, un método, con el mismo nombre, pero con código
 * distinto Y que depende desde que objeto se lo llama, cumplirá con ese código
 * específico. Ej, en las clases anteriores, metodo "informacion"
 */
