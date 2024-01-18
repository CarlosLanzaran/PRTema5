package es.studium.ejemplosTema2;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		
		System.out.println("La suma de los cuadrados de los 100 primeros números pares es: " + SumaCuadradosPares());
	}

	private static int SumaCuadradosPares() {

		int i, resultado;
		resultado = 0;
		
		for(i = 0; i < 100; i ++) {
			if(i%2 == 0) {
				resultado = resultado + (i*i);
			}
		}
		return (resultado);
	}

}
