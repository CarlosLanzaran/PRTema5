package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int lado1;
		int lado2;
		int lado3;
		
		System.out.println("Indica el primer lado: ");
		lado1= teclado.nextInt();
		
		System.out.println("Indica el segudo lado: ");
		lado2= teclado.nextInt();
		
		System.out.println("Indica el tercer lado: ");
		lado3= teclado.nextInt();
		
		teclado.close();
		
		if(lado1 == lado2 & lado2 != lado3 | lado1 == lado3 & lado3 != lado2 | lado2 == lado3 & lado3 != lado1) {
			System.out.println("El triángulo es Isósceles");
		}
		else if(lado1 == lado2 & lado3==lado2 & lado3==lado1) {
			System.out.println("El triángulo es Equilátero");
		}
		else if(lado1 != lado2 & lado3!=lado2 & lado3!=lado1){
			System.out.println("El triángulo es Escaleno");
		}
	}

}
