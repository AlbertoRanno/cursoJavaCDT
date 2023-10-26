package paquete2;

class Main {

	public static void main(String[] args) {
		// En curso YOUTUBE, sigue con Tutorial 10 - Matrices - Arreglos Bidimensionales
		// En curso UDEMY, sigue con Lección 4 - Tipos de datos - Ver desde Apache
		// NetBeans

		// Arreglos Bidimensionales: un arreglo dentro de otro arreglo
		int x[][];
		x = new int[3][3]; // una matriz de 3 filas y 3 columnas
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		x[1][2] = 6;
		x[2][0] = 7;
		x[2][1] = 8;
		x[2][2] = 9;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("x["+i+"]["+j+"] = " + x[i][j]);
			}

		}

	}

}
