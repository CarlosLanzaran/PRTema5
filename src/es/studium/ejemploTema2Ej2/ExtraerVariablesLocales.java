package es.studium.ejemploTema2Ej2;

public class ExtraerVariablesLocales
{
	private static int numero = 3;

	public static void main (String [] args)
	{
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
		
		numero = 5;
		
		System.out.println("El factorial de " + numero + " es " + calcularFactorial(numero));
	}
	
	public static double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}
}
 