package es.studium.practicaTema1;

public class Ej5 {

	public static void main(String[] args) {

		// Creamos 2 arrays con los nombres de las montañas y sus alturas
		String[] montanas = {"Everest", "Mont Blanc", "Veleta", "Aneto",};
		int[] alturas = {8849, 4809, 3394, 3404};

		// Inicializamos las nuevas variables con el primer valor del array
		int maxAltura = alturas[0];
		String montanaMasAlta = montanas[0];

		/* Creamos un bublre for que recorra todas las posiciones comparando posición a posición si la altura más alta es mayor a la
		posición actual*/
		for (int i = 1; i < alturas.length; i++) {
			if (alturas[i] < maxAltura) {
				maxAltura = alturas[i];
				montanaMasAlta = montanas[i];
			}
		}

		// Mostramos el resultado llamando a la variable "montanaMasAlta" y "maxAltura"
		System.out.println("La montaña más alta es " + montanaMasAlta + " con una altura de " + maxAltura + " metros.");
	}

}
