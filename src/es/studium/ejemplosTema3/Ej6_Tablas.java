package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Ej6_Tablas {

	public static void main(String[] args) {

		final int MAX = 2;
		
		int contador[] = new int [MAX];
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Dame un número (0 para salir)");
			
			numero = teclado.nextInt();
			
			if(numero > 0) {
				contador[0]++;
			}
			else {
				contador[1]++;
			}
			
		}while(numero!=0);
		
		teclado.close();
		
		System.out.println(contador[0] + " números positivos");
		
		System.out.println((contador[1] -1) + " números negativos");
		
	}

}
