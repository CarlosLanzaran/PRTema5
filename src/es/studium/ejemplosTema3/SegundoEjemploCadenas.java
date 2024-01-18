
package es.studium.ejemplosTema3;

import java.util.Scanner;

public class SegundoEjemploCadenas

{
	public static void main(String[] args)

	{

		String cadena1 = "", cadena2 = "";

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame una cadena:");

		cadena1 = teclado.nextLine();

		System.out.println("Dame otra cadena:");

		cadena2 = teclado.nextLine();

		teclado.close();

		if(cadena1.equals(cadena2))

		{
			System.out.println("Son iguales");

		}

		else

		{
			System.out.println("Son distintas");

		}

	}

}