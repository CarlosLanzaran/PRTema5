package es.studium.ejemplosTema3;

import java.util.Scanner;

public class PrimerEjemploCadenas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);


		String nombre;
		String apellidos = "";
		String correoElectronico = null;
		
		String direcion = "C/ de la Huerta, 21";
		String localidad = new String();
		String provincia = new String();
		String pais = new String("España");
		
		
		//Asiganar valores
		
		nombre = "Carlos";
		System.out.println("Dame tus apellidos");
		apellidos = teclado.nextLine();
		teclado.close();
		System.out.println("Hola, " + nombre + " " + apellidos);
		System.out.println("Longitud de tus apellidos: " + apellidos.length());
		
		for (int i = 0; i < apellidos.length(); i ++) {
			System.out.println(apellidos.charAt(i));
		}
	}

}
