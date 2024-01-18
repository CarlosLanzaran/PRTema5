package es.studium.ejemplosTema3;

public class TercerEjemploTablas {

	public static void main(String[] args) {
		
		String dias[] = {"Lunes, Martes, Miércoles, Jueves , Viernes, Sábado, Domingo"};
		
		for(int i = 0; i < dias.length; i++) {
			if(i<5) {
				dias[i] = dias[i] = "Laboral";
			}
			else {
				dias[i] = dias[i] = "Festibo";
			}
		}
		
		for (String dia: dias) {
			System.out.println(dia);
		}
		
		
	}

}
