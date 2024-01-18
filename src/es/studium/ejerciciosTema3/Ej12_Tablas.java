package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ej12_Tablas

{
	public static void main(String[] args)

	{

		final int FILAS = 3;
		final int COLUMNAS = 3;

		int matriz[][] = new int[FILAS][COLUMNAS];

		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < FILAS; i++)

		{
			for(int j = 0; j < COLUMNAS; j++){
				
				System.out.println("Matriz["+i+"]["+j+"]");

				matriz[i][j] = teclado.nextInt();
			}

		}
		teclado.close();

		for(int i = 0; i < FILAS; i++){
			
			for(int j = 0; j < COLUMNAS; j++){	
				
				//System.out.print(traspuesta [i] [j] + " ");
			}
			
		}


	}

}		