package es.studium.tema4;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1_awt implements WindowListener, ActionListener{

	Frame ventana = new Frame ("Par / Impar");

	TextField txtNumero = new TextField(20);

	Button btnBoton = new Button ("Calcular");

	Label lblResultado = new Label ("				");


	public Ejercicio1_awt(){

		ventana.setLayout(new FlowLayout());

		ventana.add(txtNumero);
		ventana.add(btnBoton);
		ventana.add(lblResultado);

		ventana.addWindowListener(this);
		btnBoton.addActionListener(this);

		ventana.setSize(600,100);
		ventana.setBackground(Color.yellow);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args) {
		new Ejercicio1_awt();

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
	public void actionPerformed(ActionEvent e) {
		
		int nunero = Integer.parseInt(txtNumero.getText());	
		
		String mensaje;
		
		if(nunero % 2 == 0) {
			
			mensaje = "Es par";
		}
		else {
			mensaje = "Es impar";
			
		}
		
		lblResultado.setText(mensaje);
	}

}
