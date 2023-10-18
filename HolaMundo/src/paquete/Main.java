package paquete;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		//Lo primero de todo el el código que se va ejecutar, es este método

		/*Compilación: para correrlo por fuera del programa
		 * File - Export - Runnable JAR file - Next - Seleccionar la clase principal (Main) - 
		 * Tildar => Extraer las librerías requeridas en el archivo JAR generado - Terminar 
		 * Luego en el directorio del archivo, abrir CMD - presiono:
		 * dir
		 * java -jar nombreDelArchivo.jar
		 * Enter y debería Ejecutarse*/
		
		/* short - int - long (enteros)
		 * float - double (flotantes - decimales)
		 * byte
		 * char (caracteres del 0 al 255
		 * boolean (verdaderos o falsos)
		 * String (cadenas de texto)
		 *  + - * % / */
		
		/* Residuo, Módulo, o Resto: es el sobrante de dividir un número por otro. Considerando la división ENTERA entre los números,
		 * por eso, el Resto de 5 Float, divido 2, sigue siendo 1 (y no 0) */
		
		int variable1;
		variable1 = 5;
		System.out.println(variable1);
		int resultado;
		resultado = variable1 + 2;
		System.out.println("El resultado es: "+resultado);
		System.out.println("Suma: la variable1 + 2 = " + (variable1 + 2));
		System.out.println("Resta: la variable1 - 2 = " + (variable1 - 2));
		System.out.println("Multipliación: la variable1 * 2 = " + (variable1 * 2));
		System.out.println("División: la variable1 / 2 = " + (variable1 / 2) + " (Recordar que estoy operando enteros)");
		System.out.println("Residuo: la variable1 % 2 = " + (variable1 % 2));
		
		float variable2 = 5;
		System.out.println("División: la variable2 / 2 = " + (variable2 / 2) + " (Ahora estoy operando flotantes)");
		System.out.println("Residuo: la variable2 % 2 = " + (variable2 % 2) + " (El Residuo, por definición, lógicamente sigue siendo 1)");
		
		short suma = 3 + 10;
		System.out.println(suma);
		int resta = 8 - 17;
		System.out.println(resta);
		long residuo = 9 % 2;
		System.out.println(residuo);
		float multiplicacion = 2*(15*(-2));
		System.out.println(multiplicacion);
		double division = 10/3.4;
		System.out.println(division);
		
		//Operandos lógicos < > =< => == || && !
		int var = 5;
		boolean condicion;
		if(!(var != 5) && (var < 6))
		{
			condicion = true;
		}
		else
		{
			condicion = false;
		}
		
		if(condicion)
		{
			System.out.println("Verdadero");
		}
		else
		{
			System.out.println("Falso");
		}
		
		//Ciclos
		for(int contador = 0; contador <= 5; contador++)
		{
			System.out.println(contador);
		}
		for(int contador = 4; contador >= 0; contador--)
		{
			System.out.println(contador);
		}
		for(int contador = 1; contador <= 20; contador++)
		{
			contador = contador*2;
			System.out.println("Contador vale = " + contador);
		}
		/*contador = 1
		 * es < 20 
		 * contador = 1*2 = 2
		 * 2+1
		 * es <20
		 * contador = 3*2 = 6
		 * 6+1
		 * es <20
		 * contador = 7*2 = 14 
		 * 14+1
		 * es <20
		 * contador = 15*2 = 30
		 * 30+1
		 * ya NO es < 20 => FIN del ciclo
		 * */
		
		int x = 0;
		while(x<=10)
		{
			System.out.println("El valor de x es: "+x);
			x = x + 2;
		}
		/* se imprime x = 0
		 * 0 + 2 = 2
		 * 2 <= 10
		 * se imprime x = 2
		 * ...
		 * 8 + 2 = 10
		 * 10 <= 10
		 * se imprime x = 10
		 * 10 + 2 = 12
		 * ya NO es <= 10 => FIN del ciclo
		 * */
		
		boolean condicion2 = true;
		int y = 0;
		while(condicion2)
		{
			System.out.println("El valor de x es: "+y);
			y = y + 2;
			
			if ( y >= 8) 
			{
				condicion2 = false;
			}
		}
		
		//	break; => salirse de un ciclo - Se suelen usar dentro de los condicionales	
		for(int i=0; i<=10; i++)
		{
			System.out.println("Aún estás en el ciclo");
			if (i==4)
			{
				break;
			}
			System.out.println("El valor de i es :" +i);
		}
		System.out.println("Haz salido del ciclo");
		
		
		// continue; => no salgo por completo del ciclo, más bien, salteo determinadas condiciones		
		for(int i=0; i<=10; i++)
		{
			System.out.println("Aún estás en el ciclo");
			if (i==4)
			{
				continue;
			}
			System.out.println("El valor de i es :" +i);
		}
		System.out.println("Haz salido del ciclo");
		
		//Tutorial 7: Ciclos, Serie de números impares, y Fibonacci (0...	1,1,2,3,5,8,11,... - la suma de los 2nros previos)
		for(int i=0; i<= 100; i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}
		// Fibonacci
		int nroActualSerie = 1; // Considero el primer nro, el 1, y no el 0
		int nroAnteriorSerie = 0;
		int temporal;
	
		while(true)
		{
			System.out.println(nroActualSerie);
			temporal = nroActualSerie;
			nroActualSerie =  nroActualSerie + nroAnteriorSerie;
			nroAnteriorSerie = temporal;
			if(nroActualSerie > 30) //Punto arbitrario para detener el programa
			{
				break;
			}
		}
		/*
		 * imprimo 1
		 * temporal toma el valor de 1
		 * el actual, toma el valor de 1 + 0
		 * el anterior, pasa a valer, lo que valía el actual (anterior = 1)
		 * imprimo 1
		 * temportal toma el valor de 1
		 * actual toma el valor de 1 + 1
		 * anterior toma el valor de 1
		 * imprimo 2
		 * temporal toma el valor de 2
		 * el actual, toma el valor de 2 + 1
		 * ...*/
		
		//Seguir por Tutorial 8 switch...
		
	}

}
