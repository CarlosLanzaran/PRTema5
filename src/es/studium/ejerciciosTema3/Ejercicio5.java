package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String cadena = "";
		
		System.out.println("Dame una cadena con mayúsculas y minúsculas intercaladas");
		cadena = teclado.nextLine();
		
		teclado.close();
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
	}

}
