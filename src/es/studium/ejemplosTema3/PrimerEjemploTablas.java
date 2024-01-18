package es.studium.ejemplosTema3;

import java.util.Scanner;

public class PrimerEjemploTablas {

	public static void main(String[] args) {
		
		final int TAM = 5;
		
		Scanner teclado = new Scanner(System.in);
		
		//int tabla[] = {2, 4, 6, 8};
		
		int tabla2[] = new int[TAM];
		
		for (int i = 0; i < TAM; i ++) {
			
			System.out.println("Dame el valor de la posición " + (i+1));
			tabla2[i] = teclado.nextInt();
		} 
		
		teclado.close();
		
		//for (int i = 0; i < TAM; i++){
		//	tabla2[i] = tabla2[i]*2;
		//}
		
		for (int i = 0; i < TAM; i++){
			System.out.println(tabla2[i]*2);
		}
		
		
	}

}
