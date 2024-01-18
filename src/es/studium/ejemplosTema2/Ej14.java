package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		
		int base, exponente;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		base = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		
		exponente = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("El número " + base + " elevado a " + exponente + " es igual a: " + potencia(base, exponente));
	}
	
	private static int potencia (int base, int exponente) {
		int i, resultado;
		resultado = 1;
		for (i = 1; i <= exponente; i++) {
			resultado = resultado * base;
			
		}
		return resultado;
	}

}
