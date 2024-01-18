package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {

		int a,b,c;

		float resultado;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un número equivalente a la letra a:");

		a = teclado.nextInt();

		System.out.println("Dame un número equivalente a la letra b:");

		b = teclado.nextInt();

		System.out.println("Dame un número equivalente a la letra c:");

		c = teclado.nextInt();
		
		teclado.close();

		resultado = raiz (a,b,c);
		
		System.out.println("El resultado es " + resultado);
	}

	public static float raiz (int a, int c, int b) {

		float r;
		r = (((float) b * (float) b) - (4 * (float) a * (float) c) / 2 * (float) a);

		return(r);
	}


}
