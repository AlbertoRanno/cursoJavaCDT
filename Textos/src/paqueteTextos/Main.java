package paqueteTextos;

public class Main {

	public static void main(String[] args) {

		Textos objetoLector = new Textos();
		objetoLector.leer("archivo.txt");
		// Acá llamo al nombre del archivo porque es lo que declare como argumento en la
		// clase
	}

}
