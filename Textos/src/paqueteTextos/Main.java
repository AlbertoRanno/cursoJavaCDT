package paqueteTextos;

public class Main {

	public static void main(String[] args) {

		//Textos objetoLector = new Textos();
		//objetoLector.leer("archivo.txt"); //lo lee
		// Acá llamo al nombre del archivo porque es lo que declare como argumento en la
		// clase

		Textos objetoEscritor = new Textos();
		objetoEscritor.escribir("escrito.txt"); //lo crea y escribe
		//luego click derecho al proyecto, y refresh, para que aparezca el archivo

	}

}
