package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ej1_awt {

	public static void main(String[] args) {
		
		//Crear contenedor (GUI)
		
		Frame ventana = new Frame ("Ventana bien golfa");
		Button btnBoton = new Button ("Invadir Polonia");
		Button btnBoton2 = new Button ("Invadir Jerusalen");

		
		ventana.setLayout(new FlowLayout());
		
		ventana.add(btnBoton);
		ventana.add(btnBoton2);

		
		ventana.setSize(400,300);
		ventana.setBackground(Color.blue);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

}
