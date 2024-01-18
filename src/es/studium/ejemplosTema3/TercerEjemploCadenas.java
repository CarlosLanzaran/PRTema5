package es.studium.ejemplosTema3;

public class TercerEjemploCadenas

{

	public static void main(String[] args)

	{
		String nombre = "Cristina";

		int edad = 28;

		String cadenaFormateada = "Nuestra amiga %s tiene %d años";

		System.out.println(String.format(cadenaFormateada, nombre, edad));


		int hora = 15;

		int minutos = 5;

		String horaFormateada = "%02d:%02d";

		System.out.println(String.format(horaFormateada, hora, minutos));


		int numerador = 7;

		int denominador = 3;

		String divisionFormateada = "%.2f";

		System.out.println(String.format(divisionFormateada, (float)numerador/(float)denominador));

	}

}

