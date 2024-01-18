package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);

		String cadena = "";
		char letra;
		boolean encontrado = false;
		
		System.out.println("Dame una frase:");
		cadena = teclado.nextLine();
		
		System.out.println("Dame un carácter de la frase anterior:");
		letra = teclado.nextLine().charAt(0);
		
		
		teclado.close();
		
		for(int i = 0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i) == letra) {
				System.out.println("El caracter está en " +  (i+1));
				i = cadena.length();
				encontrado = true;
			}
			
		}
		if (!encontrado) {
			System.out.println("El caracter no se encuentra");
		}
	}

}
