package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		int num1;
		
		int num2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		
		num2 = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("La suma es " + (num1 + num2));


		
	}

}
