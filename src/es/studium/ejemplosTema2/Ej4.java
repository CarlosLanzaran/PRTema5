package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");

		num2 = teclado.nextInt();
		
		teclado.close();
		
		if (num1 > num2) {
			System.out.println("El numero " + num1 + " es mayor");
		}
		else if (num1 < num2) {
			System.out.println("El numero " + num2 + " es mayor");
		}
		else {
			System.out.println("Los números son iguales");
		}
	}

}
