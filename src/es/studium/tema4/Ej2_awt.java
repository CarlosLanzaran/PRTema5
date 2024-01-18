package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ej2_awt {

	Button btnBoton = new Button ("Invadir Polonia");
	Button btnBoton2 = new Button ("Invadir Jerusalen");
	
	public Ej2_awt(){
		
		Frame ventana = new Frame ("Ventana bien golfa");

		ventana.setLayout(new FlowLayout());
		
		ventana.add(btnBoton);
		ventana.add(btnBoton2);

		
		ventana.setSize(400,300);
		ventana.setBackground(Color.blue);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Ej2_awt();
	}

}
