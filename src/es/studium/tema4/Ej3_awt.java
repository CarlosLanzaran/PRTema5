package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class Ej3_awt {
	
	Frame ventana = new Frame ("Ventana bien golfa");
	Label lblNombre = new Label ("Nombre:");
	Label lblNombre2 = new Label ("Nombre:");

	TextField txtNombre = new TextField(20);
	TextField txtNombre2 = new TextField(20);
	Button btnBoton = new Button ("Invadir Polonia");
	Button btnBoton2 = new Button ("Invadir Jerusalen");

	
	public Ej3_awt(){

		ventana.setLayout(new FlowLayout());
		
		ventana.add(lblNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre);
		ventana.add(txtNombre2);
		ventana.add(btnBoton);
		ventana.add(btnBoton2);


		
		ventana.setSize(300,200);
		ventana.setBackground(Color.blue);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
			
		new Ej3_awt();
	}

}
