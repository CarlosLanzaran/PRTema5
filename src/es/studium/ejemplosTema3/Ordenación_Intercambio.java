package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Ordenación_Intercambio {

	public static void main(String[] args) {
		
		final int TAM = 10;
		
		Scanner teclado = new Scanner(System.in);
		
		int tabla[] = new int[TAM];
		
		int i,j,aux;
		
		for(i = 0; i < TAM; i++) {
			
			System.out.println("Dame un número entero");
			tabla[i]=teclado.nextInt();
		}
		
		for (i = 0; i < TAM; i ++) {
			
			for(j = i+1; j < TAM; j ++) {
				
				if(tabla[i]>tabla[j]) {
					
					aux=tabla[i];
					tabla[i]=tabla[j];
					tabla[j]=aux;
				}
			}
		}
		System.out.println("La tabla ordenada queda así");
		
		for(i = 0; i < TAM; i++) {
			
			System.out.print(tabla[i] + ", ");
		}
	}

}
