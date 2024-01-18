package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		
		System.out.println("Indicar el valor de x1:");
		x1= teclado.nextInt();
		
		System.out.println("Indicar el valor de x2:");
		x2= teclado.nextInt();
		
		System.out.println("Indicar el valor de y1:");
		y1= teclado.nextInt();
		
		System.out.println("Indicar el valor de y2:");
		y2= teclado.nextInt();
		
		pendiente (x1, x2, y1, y2);
		
		teclado.close();
	}
	public static void pendiente (int x1, int x2, int y1, int y2)
	{
		System.out.println("La pendiente entre los dos puntos es:" +(((float)y2-
				(float)y1)/((float)x2-(float)x1)));
	}


}
