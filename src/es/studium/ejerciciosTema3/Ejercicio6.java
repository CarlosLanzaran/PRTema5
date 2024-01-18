package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena1 = "";
		String cadena2 = "";
		
		System.out.println("Dame la primera cadena");
		cadena1 = teclado.nextLine();
		
		System.out.println("Dame la segunda cadena");
		cadena2 = teclado.nextLine();
		
		teclado.close();
		
		if(cadena1.equals(cadena2)) {
			System.out.println("Las cadenas son iguales");
		}
		else{
			System.out.println("Las cadenas son distintas");
		}
	}

}
