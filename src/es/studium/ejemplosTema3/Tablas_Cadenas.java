package es.studium.ejemplosTema3;

public class Tablas_Cadenas {

	public static void main(String[] args) {



		// CrearunaCadena

		String cadena = "Elefante";

		// Tabladecaracteres

		char tabla[] = new char[8];

		tabla[0] = 'E';

		tabla[1] = 'l';

		tabla[2] = 'e';

		tabla[3] = 'f';

		tabla[4] = 'a';

		tabla[5] = 'n';

		tabla[6] = 't';

		tabla[7] = 'e';

		for(int i = 0; i < cadena.length(); i++)

		{

			System.out.print(i+" ");

		}

		System.out.println();

		for(int i = 0; i < cadena.length(); i++)

		{

			System.out.print(cadena.charAt(i)+" ");

		}

		System.out.println();

		for(int i = 0; i < tabla.length; i++)

		{

			System.out.print(tabla[i] + " ");

		}

	}

}
 

