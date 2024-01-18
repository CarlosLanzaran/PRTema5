package es.studium.ejemplosTema3;

import java.util.Scanner;

public class Busqueda {

	public static void main(String[] args) {
		
		final int TAM = 10;
		
		Scanner teclado = new Scanner(System.in);
		
		int tabla[] = new int [TAM];
		int buscado;
		boolean encontrado = false;
		
		for (int i = 0; i< TAM; i++) {
			System.out.println("Dame el valor de la posición " + i);
			tabla[i] = teclado.nextInt();
		}
		System.out.println("Dame el número a buscar: ");
		buscado = teclado.nextInt();
		teclado.close();
		
		for (int i = 0; i< TAM; i++) {
			if (buscado == tabla[i]){
				System.out.println("El elemento está em la posición " + i);
				encontrado = true;
			}
			
		}
		if (!encontrado){
			System.out.println("El número no se encuentra");
		}
		
	}

}
