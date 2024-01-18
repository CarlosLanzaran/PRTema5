package es.studium.tema5;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1_awt {
	
	Frame ventana = new Frame ("Par / Impar");
	
	TextField txtNombre = new TextField(20);
	
	Button btnBoton = new Button ("Calcular");
	
	Label lblNombre = new Label ("El número X es PAR/IMPAR");

	
	public Ejercicio1_awt(){

		ventana.setLayout(new FlowLayout());
		
		ventana.add(txtNombre);
		ventana.add(btnBoton);
		ventana.add(lblNombre);


		ventana.setSize(600,100);
		ventana.setBackground(Color.yellow);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ejercicio1_awt();

	}

}
