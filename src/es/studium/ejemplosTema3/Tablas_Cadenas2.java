package es.studium.ejemplosTema3;

public class Tablas_Cadenas2 {

	public static void main(String[] args) {


		String continentes = "Europa, Asia, África, América, Oceanía, Antártida";

		String tabla[] = continentes.split(", ");

		for(String continente: tabla)

		{

			System.out.println(continente);

		}

		System.out.println("##################");

		for(int i = 0; i < tabla.length; i++)

		{

			System.out.println(tabla[i]);

		}

	}

}
