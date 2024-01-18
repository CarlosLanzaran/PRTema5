package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {

		int num1, num2, resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		
		num2 = teclado.nextInt();
		
		teclado.close();
		
		resultado = sumar (num1, num2);
		
		System.out.println("El resultado es " + resultado);
	}
	
	public static int sumar (int a, int b) {
		
		int r;
		r = a + b;
		return (r);
	}
}
