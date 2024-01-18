package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		int numero, veces;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un número:");

		numero = teclado.nextInt();

		System.out.println("Dame otro número:");

		veces = teclado.nextInt();

		teclado.close();
		for (int i = 1; i <= veces; i++) {
			System.out.println(numero);
		}
	}

}
