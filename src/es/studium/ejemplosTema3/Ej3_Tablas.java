package es.studium.ejemplosTema3;

public class Ej3_Tablas {

	public static void main(String[] args) {
		
		final int MAX = 20;
		int pares[] = new int [MAX];

		for (int i = 0; i < MAX; i++){

			pares[i] = i*2;
		}

		for (int i = MAX-1; i >= 0; i--){
			System.out.println(pares[i]);

		}
	}
}
