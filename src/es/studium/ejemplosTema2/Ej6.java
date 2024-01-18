package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		a = teclado.nextInt();
		
		System.out.println("Dame un número:");
		
		b = teclado.nextInt();
		
		teclado.close();
		
		if (a > b) {
			System.out.println("El número 1 debe ser más grande que el 2");
		}
		else {
			
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
		}
			
	    }

	}

}
