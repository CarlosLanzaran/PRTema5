package es.studium.tema5;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3_awt implements WindowListener, ActionListener{

	
	Frame ventana = new Frame ("Conversión de temperaturas");
	
	Label lblNombre = new Label ("Celsius");
	Label lblNombre2 = new Label ("Fatrenhet");
	
	TextField txtNombre = new TextField(20);
	TextField txtNombre2 = new TextField(20);
	
	Button btnBoton = new Button ("Celsius a Fatrenhet");
	Button btnBoton2 = new Button ("Fatrenhet a Celsius");

	public Ejercicio3_awt() {
		
		ventana.addWindowListener(this);
		
		ventana.setLayout(new GridLayout(3,2));
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnBoton);
		ventana.add(btnBoton2);
		
		btnBoton.addActionListener(this);
		btnBoton2.addActionListener(this);


		ventana.setSize(300,150);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	
	public static void main(String[] args) {
		
		new Ejercicio3_awt();

	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource().equals(btnBoton)) {
			
			float celsius = Float.parseFloat(txtNombre.getText());
			float resultado = (celsius *(9.0f / 5.0f)) + 32.0f;
			txtNombre2.setText(resultado + "");
			txtNombre.setText("");
		}
		else if(evento.getSource().equals(btnBoton2)) {
			
			float celsius = Float.parseFloat(txtNombre2.getText());
			float resultado = (celsius - 32.0f) / (9.0f / 5.0f);
			txtNombre.setText(resultado + "");
			txtNombre2.setText("");

		}
	}

}
