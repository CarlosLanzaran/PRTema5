package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		
		num2 = teclado.nextInt();
		
		teclado.close();
		
		if (num1 < num2) {
			
			System.out.println("La suma del número 1 y número 2 es: " + (num1+num2));
		}
		else {
			System.out.println("El producto del número 1 por el número 2 es: " + (num1*num2));
		}
		
		
	}

}
