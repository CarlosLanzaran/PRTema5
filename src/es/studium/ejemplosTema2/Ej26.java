package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad, n;
		
		System.out.println("Indique su nombre:");
		nombre= teclado.nextLine();
		
		System.out.println("Indique el año de su nacimiento:");
		n= teclado.nextInt();
		
		edad=2030-n;
		
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + edad + " años");
		
		teclado.close();


	}

}
