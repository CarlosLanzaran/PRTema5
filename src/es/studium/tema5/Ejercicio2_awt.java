package es.studium.tema5;

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

public class Ejercicio2_awt implements WindowListener, ActionListener {
	
	Frame ventana = new Frame ("Calcular el IVA");
	
	TextField txtNombre = new TextField(20);
	TextField txtNombre2 = new TextField(20);
	TextField txtNombre3 = new TextField(20);


	
	Button btnBoton = new Button ("Calcular");
	
	Label lblNombre = new Label ("Introduzca la cantidad");
	Label lblNombre2 = new Label ("Introduzca el porcentaje");
	Label lblNombre3 = new Label ("Resultado");



	
	public Ejercicio2_awt(){

		ventana.addWindowListener(this);
		
		ventana.setLayout(new FlowLayout());
		
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblNombre2);
		ventana.add(txtNombre2);
		ventana.add(btnBoton);
		ventana.add(lblNombre3);
		ventana.add(txtNombre3);

		btnBoton.addActionListener(this);

		ventana.setSize(1000,100);
		ventana.setBackground(Color.red);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ejercicio2_awt();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		float cantidad = Float.parseFloat(txtNombre.getText());	
		float porcentaje = Float.parseFloat(txtNombre2.getText());	
		float resultado = cantidad * porcentaje / 100.0f;
		
		txtNombre3.setText(resultado + "");
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

}
