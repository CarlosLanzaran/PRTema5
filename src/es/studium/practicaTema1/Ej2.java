package es.studium.practicaTema1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame solo la hora sin minutos:");
		
		//Declaramos la variable donde se almacenará el valor que nos a dado el usuario
		int h;
		
		h = teclado.nextInt();
		
		System.out.println("Dame los minutos:");
		
		int m;
		
		m= teclado.nextInt();
		
		teclado.close();
		
		//Primero comprubo que el número que me ha dado el usuario sea adecuado
		if(h > 24) {

			System.out.println("Fornato de hora incorrecta");

		}
		//Ahora miro si es menor que 12 y si es así lo dejo igual
		else if(h <= 12){
			System.out.println("La hora en formato 12h es: " + h);
		}
		
		//Y si es mayor le resto 12 para dejarlo en formato 12h
		else if(h > 12) {
			
			h =  h - 12;
			System.out.println("La hora en formato 12h es: " + h);
		}
	}
}
