package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palabra1, palabra2;
		
		System.out.println("Dame una palabra:");
		palabra1 = teclado.nextLine();


		System.out.println("Dame otra palabra:");
		palabra2 = teclado.nextLine();

		teclado.close();
		
		comparar(palabra1, palabra2);
		
		
	}

	private static void comparar(String palabra1, String palabra2) {
		
		if(palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		}
		
		else if(palabra1.compareTo(palabra2)>0) {
			System.out.println("La primera palabra es mayor");
		}
		else {
			System.out.println("La segunda palabra es mayor");
		}
	}

}
