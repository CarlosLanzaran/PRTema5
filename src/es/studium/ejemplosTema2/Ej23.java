package es.studium.ejemplosTema2;

public class Ej23 {

	public static void main(String[] args) {
				
		System.out.println("La suma de los cuadrados de los 100 primeros números naturales es: " + SumaCuadrados());
	}

	private static int SumaCuadrados() {

		int i, resultado;
		resultado = 0;
		
		for(i = 0; i < 100; i ++) {
			resultado = resultado + (i*i);
		}
		return (resultado);
	}

}
