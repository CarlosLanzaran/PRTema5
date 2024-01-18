package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		int base, exponente, resultado, i;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		base = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		
		exponente = teclado.nextInt();
		
		teclado.close();
		
		resultado = 1;
		
		for (i = 1; i <= exponente; i++)
			resultado = resultado*base;
		
		System.out.println("El resultado es " + resultado);
	}

}
