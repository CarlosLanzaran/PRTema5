package es.studium.practicaTema1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		//Creamos los valores que luego nos servirá para guardar los datos del algoritmo
		double F, C, I, N;

		Scanner scanner = new Scanner(System.in);
		
		//Pedimos que nos de los valores de todas las variables
		System.out.println("Dame el valor de la F:");
		
		F = scanner.nextInt();
		
		System.out.println("Dame el valor de la C:");

		C = scanner.nextInt();
		
		System.out.println("Dame el valor de la I:");

		I = scanner.nextInt();
		
		System.out.println("Dame el valor de la N:");

		N = scanner.nextInt();
		
		//Creamos la formula para resolver el problema con la herramienta "Math.pow"
        F = C * Math.pow((1 + I), N+1);
        
        //Imprimimos el resultado retornando el valor "F"
		System.out.println("El interés compuesto es: " + F);

	}
}
