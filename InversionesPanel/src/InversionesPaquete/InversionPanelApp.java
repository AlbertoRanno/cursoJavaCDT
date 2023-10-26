package InversionesPaquete;

public class InversionPanelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Panel de Inversiones");
		/*
		 * 1 - Clases de Datos:
		 * 
		 * a. Cedear:
		 * 
		 * Atributos: Nombre del cedear Símbolo o ticket del cedear Cotización actual
		 * Precio de compra Cantidad en tenencia Otros atributos relevantes Métodos:
		 * Getters y setters para los atributos.
		 * 
		 * b. Criptomoneda:
		 * 
		 * Atributos: Nombre de la criptomoneda Símbolo o ticket de la criptomoneda
		 * Cotización actual Precio de compra Cantidad en tenencia Otros atributos
		 * relevantes Métodos: Getters y setters para los atributos.
		 * 
		 * 2 - Clase Principal:
		 * 
		 * c. InversionesPanelApp (la clase que ya tienes):
		 * 
		 * En esta clase, puedes crear objetos Cedear y Criptomoneda para representar
		 * tus inversiones. Puedes cargar información sobre tus inversiones en el método
		 * main, por ejemplo:
		 */

		// Cedear cedear1 = new Cedear("NombreCedear1", "CED1", 100.0, 95.0, 10);
		// Criptomoneda cripto1 = new Criptomoneda("Bitcoin", "BTC", 50000.0, 48000.0,
		// 2);
		// Otros objetos Cedear y Criptomoneda...

		/*
		 * Funcionalidades Adicionales:
		 * 
		 * Puedes agregar funcionalidades como calcular el valor total de tus
		 * inversiones, realizar seguimiento de ganancias y pérdidas, y generar informes
		 * detallados. También puedes pensar en la persistencia de datos, como almacenar
		 * la información en una base de datos o archivos para que puedas recuperarla en
		 * sesiones futuras de la aplicación. Interfaz de Usuario (Futuro):
		 * 
		 * A medida que evolucione tu proyecto, podrás crear una interfaz de usuario
		 * (UI) utilizando HTML, CSS y JavaScript para mostrar tus inversiones de una
		 * manera más amigable.
		 * 
		 * Manejo de Excepciones y Validaciones:
		 * 
		 * Agrega manejo de excepciones y validaciones para garantizar que los datos
		 * ingresados sean correctos y que la aplicación no falle debido a entradas
		 * incorrectas.
		 * 
		 * Esta es una estructura básica para comenzar a cargar información de
		 * inversiones en tu aplicación. A medida que continúes desarrollando, podrás
		 * agregar más funcionalidades y refinamientos según tus necesidades y
		 * objetivos.
		 */

		// Defino Variables a utilizar
		float mep, blue, btc;
		mep = 873.66F;
		blue = 1000F;
		btc = 34726F;
		System.out.println("Cotizaciones del día: \n\t DOLAR MEP: $" + mep + "\t\t DOLAR BLUE: $" + blue
				+ "\t\t BITCOIN: " + btc + " u$d\n");

		/*
		 * tipo float porque me parece la mejor optimización del uso de la memoria,
		 * teniendo en cuenta que las arquitecturas actuales manejan 32 o 64 bites,
		 * osea, 4 bytes de memoria, si guardo un short, o un formato que ocupe menos,
		 * me puede traer limitaciones después por sus rangos, y no estaría ganando
		 * nada, porque el espacio que reserva para esa variable, sería el mismo.
		 * Incluso los integer, ocupan lo mismo, y almacenan menos.
		 */

		// Tenencias:
		String[][] cedears = new String[8][4];

		float[] disn = { 324F, 2041.51F, 5846F }; // Cantidad - PPC (revisar) - P.Actual
		float[] t = { 163F, 1352, 98, 4360F };
		float[] baba = { 565F, 4022.7F, 7793.5F };
		float[] nvda = { 14F, 2850F, 15158F };
		float[] glob = { 6F, 3200F, 8240F };
		float[] msft = { 1F, 7007F, 9730F };
		float[] amdd = { 742F, 14.07F, 17.45F };
		float[] aapld = { 520F, 9.64F, 10.2F };


		// las operaciones las haré con los arrays, pero quiero la matriz por práctica y
		// para mostrar los datos una vez se actualicen
		// luego incorporar tambien las criptos y demases
		// chequear los promedios de compra...
		// ver de importar valores (más adelante)

		// Formo la matriz, con los 8 arrays, asignando a cada coordenada, sus valores,
		// con el paso previo, de pasarlos a String:
		cedears[0][0] = "Disney";
		cedears[0][1] = String.valueOf(disn[0]);
		cedears[0][2] = String.valueOf(disn[1]);
		cedears[0][3] = String.valueOf(disn[2]);

		cedears[1][0] = "AT&T";
		cedears[1][1] = String.valueOf(t[0]);
		cedears[1][2] = String.valueOf(t[1]);
		cedears[1][3] = String.valueOf(t[2]);

		cedears[2][0] = "Alibaba";
		cedears[2][1] = String.valueOf(baba[0]);
		cedears[2][2] = String.valueOf(baba[1]);
		cedears[2][3] = String.valueOf(baba[2]);

		cedears[3][0] = "NVDA";
		cedears[3][1] = String.valueOf(nvda[0]);
		cedears[3][2] = String.valueOf(nvda[1]);
		cedears[3][3] = String.valueOf(nvda[2]);

		cedears[4][0] = "Globant";
		cedears[4][1] = String.valueOf(glob[0]);
		cedears[4][2] = String.valueOf(glob[1]);
		cedears[4][3] = String.valueOf(glob[2]);

		cedears[5][0] = "Microsoft";
		cedears[5][1] = String.valueOf(msft[0]);
		cedears[5][2] = String.valueOf(msft[1]);
		cedears[5][3] = String.valueOf(msft[2]);

		cedears[6][0] = "AMD";
		cedears[6][1] = String.valueOf(amdd[0]);
		cedears[6][2] = String.valueOf(amdd[1]);
		cedears[6][3] = String.valueOf(amdd[2]);

		cedears[7][0] = "AAPL";
		cedears[7][1] = String.valueOf(aapld[0]);
		cedears[7][2] = String.valueOf(aapld[1]);
		cedears[7][3] = String.valueOf(aapld[2]);

		System.out.println("CEDEARS\t\t\tCANTIDAD\t\tPPC\t\t\tVALOR ACTUAL\n");

		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == 5 && (j == 0 || j == 3)) {
					System.out.print(cedears[i][j] + "\t\t");
				} else {
					System.out.print(cedears[i][j] + "\t\t\t");
				}

			}
			System.out.println("\n");
		}

	}

}
