package es.studium.ejemplosTema3;

import java.util.Scanner;

public class SegundoEjemploTablas {

	public static void main(String[] args) {
		
		final int TAM = 5;
		
		Scanner teclado = new Scanner(System.in);

		
		//Momento 1: Declarar
		String tabla[] = new String [TAM];
		
		//Momento 2: Rellenar
		for (int i = 0; i < TAM; i++) {
			System.out.println("Dame una candena " + (i+1));
			
			tabla[i] = teclado.nextLine();
		} 
		
		//Momento 3:
		for(int i = 0; i < TAM; i++) {
			tabla[i] = tabla[i].toUpperCase();
		}
		
		//MOmento 4: Mostrar contenido
		for (String cadena: tabla){
			System.out.println(cadena);
		}
		
	}

}
