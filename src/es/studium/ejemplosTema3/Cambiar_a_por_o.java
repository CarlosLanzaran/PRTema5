package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Cambiar_a_por_o {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String texto1, texto2;
		
		System.out.println("Escribe un texto:");
		
		texto1 = teclado.nextLine();
		
		teclado.close();
		
		texto2 = texto1.replace('a', 'o');
		
		System.out.println(texto2);
	}

}
