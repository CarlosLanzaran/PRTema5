package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
 
		int num1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		teclado.close();
		
		for (int i = 0; i <= 10; i++) { 
			System.out.println(num1 + " x " + i + " = " + (num1*i));
		}
	}

}
