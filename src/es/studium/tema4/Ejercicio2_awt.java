package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio2_awt {
	
	Frame ventana = new Frame ("Calcular el IVA");
	
	TextField txtNombre = new TextField(20);
	TextField txtNombre2 = new TextField(20);
	TextField txtNombre3 = new TextField(20);


	
	Button btnBoton = new Button ("Calcular");
	
	Label lblNombre = new Label ("Introduzca la cantidad");
	Label lblNombre2 = new Label ("Introduzca el porcentaje");
	Label lblNombre3 = new Label ("Resultado");



	
	public Ejercicio2_awt(){

		ventana.setLayout(new FlowLayout());
		
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnBoton);
		ventana.add(lblNombre3);
		ventana.add(txtNombre3);


		ventana.setSize(1000,100);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ejercicio2_awt();

	}

}
