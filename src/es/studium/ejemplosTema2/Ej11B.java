package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej11B {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		
		num2 = teclado.nextInt();
		
		teclado.close();
		
		num3 = num1;
		num4 = num2;
		num1 = num3;
		num2 = num3;
		
		System.out.println("Ahora el  primer número es: " + num1 );
		System.out.println("Ahora el  segundo número es: " + num2 );
		
		
	}

}
