package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ej13_Tablas {

	public static void main(String[] args)
	{
		final int TAM = 3;
		Scanner teclado = new Scanner(System.in);
		int matriz1[][] = new int[TAM][TAM];
		int matriz2[][] = new int[TAM][TAM];
		int matriz3[][] = new int[TAM][TAM];
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.println("Indique el número de la matriz 1 situado en la posición "+i+","+j);
				matriz1[i][j] = teclado.nextInt();
			}
		}
		System.out.println("");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.println("Indique el número de la matriz 2 situado en la posición "+i+","+j);
				matriz2[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println("La matriz 1 es:\n");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.print("\t"+matriz1[i][j]);
			}
			System.out.println("");
		}
		System.out.println("La matriz 2 es:\n");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.print("\t"+matriz2[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				matriz3[i][j]=(matriz1[i][j])+(matriz2[i][j]);
			}
		}
		System.out.println("La matriz 3 correspondiente a la suma de la matriz 1 y la 2 es:\n");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.print("\t"+matriz3[i][j]);
			}
			System.out.println("");
		}
	}

}
