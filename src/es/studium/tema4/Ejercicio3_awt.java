package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3_awt {

	
	Frame ventana = new Frame ("Conversión de temperaturas");
	
	Label lblNombre = new Label ("Celsius");
	Label lblNombre2 = new Label ("Fatrenhet");
	
	TextField txtNombre = new TextField(20);
	TextField txtNombre2 = new TextField(20);
	
	Button btnBoton = new Button ("Celsius a Fatrenhet");
	Button btnBoton2 = new Button ("Fatrenhet a Celsius");

	public Ejercicio3_awt() {
		
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnBoton);
		ventana.add(btnBoton2);
		
		ventana.setSize(300,150);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	
	public static void main(String[] args) {
		
		new Ejercicio3_awt();

	}

}
