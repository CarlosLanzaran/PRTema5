package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Copiar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String copiar, resto;
		
		System.out.println("Escribe un texto para copiar en la siguiente cadena:");
		
		copiar = teclado.nextLine();
		
		System.out.println("Escribe el resto:");
		
		resto = teclado.nextLine();
		
		//resto = "lo anterior ha sido copiado";
		
		System.out.println(copiar + " " + resto);

		
		


	}

}
