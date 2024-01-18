package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		int numerador, denominador;
		
		float resultado;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame un número:");

		numerador = teclado.nextInt();

		System.out.println("Dame otro número:");

		denominador = teclado.nextInt();

		teclado.close();
		
		resultado = dividir(numerador, denominador);
		
		System.out.println(resultado);

	}
	
	public static float dividir (int a, int b) {
		float r;
		r = (float) a / (float) b;
		return (r);
	}
}
