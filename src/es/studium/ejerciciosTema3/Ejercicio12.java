package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String palabra1, palabra2, palabra3, palabra4, palabra5, mayor;

		System.out.println("Dame una palabra:");
		palabra1 = teclado.nextLine();

		System.out.println("Dame otra palabra:");
		palabra2 = teclado.nextLine();

		System.out.println("Dame otra palabra:");
		palabra3 = teclado.nextLine();

		System.out.println("Dame otra palabra:");
		palabra4 = teclado.nextLine();

		System.out.println("Dame otra palabra:");
		palabra5 = teclado.nextLine();

		teclado.close();

		mayor = palabra1;

		if(mayor.compareTo(palabra2)<0) {

			mayor = palabra2;
		}
		if(mayor.compareTo(palabra3)<0) {

			mayor = palabra3;
		}
		if(mayor.compareTo(palabra4)<0) {

			mayor = palabra4;
		}
		if(mayor.compareTo(palabra5)<0) {

			mayor = palabra5;
		}
		System.out.println("La mayor es " + mayor);
		
	}

}
