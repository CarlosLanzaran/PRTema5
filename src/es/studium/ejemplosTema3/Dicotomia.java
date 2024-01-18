package es.studium.ejemplosTema3;

import java.util.Random;
import java.util.Scanner;

public class Dicotomia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Random aleatorio = new Random();

		int TAM = 100;
		
		int tabla[] = new int [TAM];
		
		int inferior, superior, central, elemento_buscado, encontrado;
		
		for (int i = 0; i < TAM; i++) {
			
			tabla[i] = aleatorio.nextInt(100) + 1;
		}
		
		
		
	}

}
