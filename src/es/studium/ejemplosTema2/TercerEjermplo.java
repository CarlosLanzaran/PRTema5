package es.studium.ejemplosTema2;

import java.util.Scanner;

public class TercerEjermplo {

	public static void main(String[] args) {
		
		int  numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		
		numero = teclado.nextInt();
		
		if (numero == 0) {
			
			System.out.println("El número es 0");
		}
		else if(numero < 0){
			
			System.out.println("El múmero es negativo");
		}
		else{
			System.out.println("El número es positivo");
		}
		teclado.close();
		
		
		
		 
	}

}
