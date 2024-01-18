package es.studium.ejerciciosTema3;
import java.util.Scanner;
public class Ej16_Tabla
{
	public static void main(String[] args)
	{
		final int TAM = 3;
		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[TAM][TAM];
		int determinante = 0;
		for (int i=0;i<TAM;i++)
		{
			for (int j=0;j<TAM;j++)
			{
				System.out.println("Indique el número de la matrizsituado en la posición "+i+","+j); matriz[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		System.out.println("");
		System.out.println("La matriz es:\n");
		for (int i=0;i<TAM;i++)
		{
			for (int j=0;j<TAM;j++)
			{
				System.out.print("\t"+matriz[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		determinante=(((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]
				*matriz[1][2]*matriz[2][0])+(matriz[0][2]*matriz[1][0]*matriz[2][1]))-
				((matriz[2][0]*matriz[1][1]*matriz[0][2])+(matriz[2][1]*matriz[1][2]*matriz[0][0])+(matriz[2][2]*matriz[1][0]*matriz[0][1])));
		System.out.println("El determinante de la matriz es: "+determinante);
	}
}