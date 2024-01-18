package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Ej1_Tablas {

	public static void main(String[] args) {
		
		final int MAX = 4;
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int [MAX];
		
		for (int i = 0; i < MAX; i++) {
			System.out.println("Indica el valor de la tabla en la posición " + i);
			tabla[i] = teclado.nextInt();
		}
		
		for (int i = 0; i <MAX; i++) {
			System.out.println(tabla[i]);
		}
		
		
		
		//int tabla[] = new int[4];
		//tabla[0] = 1;
		//tabla[1] = 2;
		//tabla[2] = 3;
		//tabla[3] = 4;
		
		//for (int i = 0; i < tabla.length; i++) {
		//	System.out.println(tabla[i]);
		//}
	}

}
