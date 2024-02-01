
package es.studium.tema5;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio11_awt implements WindowListener, ActionListener
{
	Frame ventana = new Frame("Mi Calculadora");
	Button btnUno = new Button("1");
	Button btnDos = new Button("2");
	Button btnTres = new Button("3");
	Button btnCuatro = new Button("4");
	Button btnCinco = new Button("5");
	Button btnSeis = new Button("6");
	Button btnSiete = new Button("7");
	Button btnOcho = new Button("8");
	Button btnNueve = new Button("9");
	Button btnCero = new Button("0");
	Button btnIgual = new Button("=");
	Button btnMas = new Button("+");
	Button btnMenos = new Button("-");
	Button btnPunto = new Button(".");
	Button btnAsterisco = new Button("*");
	Button btnBarra = new Button("/");
	Button btnBorrar = new Button("CE");
	TextField txtPantalla = new TextField(20);
	
	float operador1;
	float operador2;
	float resultado;
	int operacion;
	
	
	public Ejercicio11_awt() {
		
		ventana.setSize(250,200);
		
		ventana.addWindowListener(this);

		ventana.setLayout(new GridBagLayout());
		
		btnUno.addActionListener(this);
		btnDos.addActionListener(this);
		btnTres.addActionListener(this);
		btnCuatro.addActionListener(this);
		btnCinco.addActionListener(this);
		btnSeis.addActionListener(this);
		btnSiete.addActionListener(this);
		btnOcho.addActionListener(this);
		btnNueve.addActionListener(this);
		btnCero.addActionListener(this);
		btnIgual.addActionListener(this);
		btnMas.addActionListener(this);
		btnMenos.addActionListener(this);
		btnPunto.addActionListener(this);
		btnAsterisco.addActionListener(this);
		btnBarra.addActionListener(this);
		btnBorrar.addActionListener(this);
		
		
		GridBagConstraints restricciones = new GridBagConstraints();

		// Comunes
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.weightx = 1.0;
		restricciones.weighty = 1.0;

		// Particulares

		restricciones.gridx = 0;
		restricciones.gridy = 0;
		restricciones.gridwidth = 4;
		ventana.add(txtPantalla, restricciones);
		restricciones.gridwidth = 1;

		restricciones.gridx = 0;
		restricciones.gridy = 1;
		ventana.add(btnBorrar, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 1;
		ventana.add(btnBarra, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 1;
		ventana.add(btnAsterisco, restricciones);

		restricciones.gridx = 3;
		restricciones.gridy = 1;

		ventana.add(btnMenos, restricciones);

		restricciones.gridx = 0;
		restricciones.gridy = 2;
		ventana.add(btnSiete, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 2;
		ventana.add(btnOcho, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 2;
		ventana.add(btnNueve, restricciones);

		restricciones.gridx = 3;
		restricciones.gridy = 2;
		restricciones.gridheight = 2;
		ventana.add(btnMas, restricciones);
		restricciones.gridheight = 1;

		restricciones.gridx = 0;
		restricciones.gridy = 3;
		ventana.add(btnCuatro, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 3;
		ventana.add(btnCinco, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 3;
		ventana.add(btnSeis, restricciones);

		restricciones.gridx = 0;
		restricciones.gridy = 4;
		ventana.add(btnUno, restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 4;
		ventana.add(btnDos, restricciones);

		restricciones.gridx = 2;
		restricciones.gridy = 4;
		ventana.add(btnTres, restricciones);

		restricciones.gridx = 3;
		restricciones.gridy = 4;
		restricciones.gridheight = 2;
		ventana.add(btnIgual, restricciones);
		restricciones.gridheight = 1;

		restricciones.gridx = 0;
		restricciones.gridy = 5;
		restricciones.gridwidth = 2;
		ventana.add(btnCero, restricciones);
		restricciones.gridwidth = 1;

		restricciones.gridx = 2;
		restricciones.gridy = 5;
		ventana.add(btnPunto, restricciones);

		//ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio11_awt();		
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
		
		if (e.getSource().equals(btnUno)) {
			txtPantalla.setText(txtPantalla.getText()+"1");
		}
		else if (e.getSource().equals(btnDos)) {
			txtPantalla.setText(txtPantalla.getText()+"2");
		}
		else if (e.getSource().equals(btnTres)) {
			txtPantalla.setText(txtPantalla.getText()+"3");
		}
		else if (e.getSource().equals(btnCuatro)) {
			txtPantalla.setText(txtPantalla.getText()+"4");
		}
		else if (e.getSource().equals(btnCinco)) {
			txtPantalla.setText(txtPantalla.getText()+"5");
		}
		else if (e.getSource().equals(btnSeis)) {
			txtPantalla.setText(txtPantalla.getText()+"6");
		}
		else if (e.getSource().equals(btnSiete)) {
			txtPantalla.setText(txtPantalla.getText()+"7");
		}
		else if (e.getSource().equals(btnOcho)) {
			txtPantalla.setText(txtPantalla.getText()+"8");
		}
		else if (e.getSource().equals(btnNueve)) {
			txtPantalla.setText(txtPantalla.getText()+"9");
		}
		else if (e.getSource().equals(btnCero)) {
			txtPantalla.setText(txtPantalla.getText()+"0");
		}
		else if (e.getSource().equals(btnMenos)) {
			txtPantalla.setText(txtPantalla.getText()+"-");
		}
		else if (e.getSource().equals(btnPunto)) {
			txtPantalla.setText(txtPantalla.getText()+".");
			btnPunto.removeActionListener(this);
		}
		else if (e.getSource().equals(btnBorrar)) {
			Pantalla();
		}
		else if (e.getSource().equals(btnMas)) {
			
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 0;
			Pantalla();
			Punto();
		}
		else if (e.getSource().equals(btnMenos)) {
			
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 1;
			Pantalla();
			Punto();
		}
		else if (e.getSource().equals(btnAsterisco)) {
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 2;
			Pantalla();
			Punto();
		}
		else if (e.getSource().equals(btnBarra)) {
			operador1 = Float.parseFloat(txtPantalla.getText());
			operacion = 3;
			Pantalla();
			Punto();
		}
		else if (e.getSource().equals(btnIgual)) {
			
			operador2 = Float.parseFloat(txtPantalla.getText());
			switch (operacion) {
				case 0:
					resultado = operador1 + operador2;
					break;
				case 1:
					resultado = operador1 - operador2;
					break;
				case 2:
					resultado = operador1 * operador2;
					break;
				case 3:
					resultado = operador1 / operador2;
					break;
			}
			txtPantalla.setText(resultado+"");
			Punto();
		}
	}
	private void Pantalla() {
		txtPantalla.setText("");
	}
	private void Punto() {
		btnPunto.removeActionListener(this);
		btnPunto.addActionListener(this);
	}
}
