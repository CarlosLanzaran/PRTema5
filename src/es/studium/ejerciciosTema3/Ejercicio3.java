package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String cadena1 = "";
		String cadena2 = "";
		
		System.out.println("Dame la primera cadena");
		cadena1 = teclado.nextLine();
		
		System.out.println("Dame la segunda cadena");
		cadena2 = teclado.nextLine();
		
		teclado.close();
		
		if (cadena1.length()==cadena2.length()) {
			System.out.println("Las cadenas son iguales");
		}
		else if (cadena1.length()>cadena2.length()){
			System.out.println("La cadena 1 es mayor");
		}
		else {
			System.out.println("La cadena 2 es mayor ");
		}
	}

}
