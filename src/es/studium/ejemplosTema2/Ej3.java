package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		int num1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		teclado.close();
		
		if (num1 %2 == 0) {
			System.out.println("El númro es par");
		}
		else {
			System.out.println("El número es impar");
		}
	}

}
