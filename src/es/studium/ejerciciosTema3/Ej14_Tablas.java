package es.studium.ejerciciosTema3;

import java.util.Scanner;

public class Ej14_Tablas {

	public static void main(String[] args)
	{
		final int TAM = 3;
		Scanner teclado = new Scanner(System.in);
		int matriz1[][] = new int[TAM][TAM];
		int matriz2[][] = new int[TAM][TAM];
		int numero;
		System.out.println("Indique el número que multiplicará a la matriz: ");
		numero = teclado.nextInt();
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.println("Indique el número de la matriz situado en la posición "+i+","+j);
				matriz1[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println("");
		System.out.println("La matriz es:\n");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.print("\t"+matriz1[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				matriz2[i][j]=matriz1[i][j]*numero;
			}
		}
		System.out.println("La matriz producto es:\n");
		for (int i = 0; i < TAM; i++)
		{
			for (int j = 0; j < TAM; j++)
			{
				System.out.print("\t"+matriz2[i][j]);
			}
			System.out.println("");
		}
	}

}
