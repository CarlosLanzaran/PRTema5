package es.studium.tema5;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio10_awt implements WindowListener, ActionListener{


	Frame ventana = new Frame("3 en raya");
	Button btnUno = new Button("");
	Button btnDos = new Button("");
	Button btnTres = new Button("");
	Button btnCuatro = new Button("");
	Button btnCinco = new Button("");
	Button btnSeis = new Button("");
	Button btnSiete = new Button("");
	Button btnOcho = new Button("");	
	Button btnNueve = new Button("");

	Dialog dlgMensaje = new Dialog (ventana, "Fin", true);
	Label lblMensaje = new Label ("			");

	int turno = 0;
	int contador = 0;
	boolean fin = false;

	public Ejercicio10_awt() {

		ventana.addWindowListener(this);

		dlgMensaje.addWindowListener(this);

		ventana.setLayout(new GridLayout(3,3));

		ventana.add(btnUno);
		btnUno.addActionListener(this);

		ventana.add(btnDos);
		btnDos.addActionListener(this);

		ventana.add(btnTres);
		btnTres.addActionListener(this);

		ventana.add(btnCuatro);
		btnCuatro.addActionListener(this);

		ventana.add(btnCinco);
		btnCinco.addActionListener(this);

		ventana.add(btnSeis);
		btnSeis.addActionListener(this);

		ventana.add(btnSiete);
		btnSiete.addActionListener(this);

		ventana.add(btnOcho);
		btnOcho.addActionListener(this);

		ventana.add(btnNueve);
		btnNueve.addActionListener(this);

		dlgMensaje.setLayout(new FlowLayout());

		dlgMensaje.setSize(200,150);
		dlgMensaje.setBackground(Color.green);
		dlgMensaje.setResizable(false);
		dlgMensaje.setLocationRelativeTo(null);

		ventana.setSize(350,350);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio10_awt();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		if(dlgMensaje.isActive()) {

			dlgMensaje.setVisible(false);
		}
		else {

			System.exit(0);		

		}	

	}

	private void reiniciar()
	{
		// Reset del contador
		contador = 0;

		// Reset del turno
		turno = 0;

		// Reset fin
		fin = false;

		// Botones: Quitar las etiquetas
		btnUno.setLabel("");
		btnDos.setLabel("");
		btnTres.setLabel("");
		btnCuatro.setLabel("");
		btnCinco.setLabel("");
		btnSeis.setLabel("");
		btnSiete.setLabel("");
		btnOcho.setLabel("");
		btnNueve.setLabel("");

		// Botones: Añadir otra vez los Listeners
		btnUno.removeActionListener(this);
		btnDos.removeActionListener(this);
		btnTres.removeActionListener(this);
		btnCuatro.removeActionListener(this);
		btnCinco.removeActionListener(this);
		btnSeis.removeActionListener(this);
		btnSiete.removeActionListener(this);
		btnOcho.removeActionListener(this);
		btnNueve.removeActionListener(this);

		btnUno.addActionListener(this);
		btnDos.addActionListener(this);
		btnTres.addActionListener(this);
		btnCuatro.addActionListener(this);
		btnCinco.addActionListener(this);
		btnSeis.addActionListener(this);
		btnSiete.addActionListener(this);
		btnOcho.addActionListener(this);
		btnNueve.addActionListener(this);
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

		if(e.getSource().equals(btnUno)) {

			if(turno ==0) {
				btnUno.setLabel("O");
				turno = 1;
			}
			else {
				btnUno.setLabel("X");
				turno = 0;
			}
			btnUno.removeActionListener(null);
		}

		else if(e.getSource().equals(btnDos)) {

			if(turno ==0) {
				btnDos.setLabel("O");
				turno = 1;
			}
			else {
				btnDos.setLabel("X");
				turno = 0;
			}
			btnDos.removeActionListener(null);
		}

		else if(e.getSource().equals(btnTres)) {

			if(turno ==0) {
				btnTres.setLabel("O");
				turno = 1;
			}
			else {
				btnTres.setLabel("X");
				turno = 0;
			}
			btnTres.removeActionListener(null);
		}

		else if(e.getSource().equals(btnCuatro)) {

			if(turno ==0) {
				btnCuatro.setLabel("O");
				turno = 1;
			}
			else {
				btnCuatro.setLabel("X");
				turno = 0;
			}
			btnCuatro.removeActionListener(null);
		}

		else if(e.getSource().equals(btnCinco)) {

			if(turno ==0) {
				btnCinco.setLabel("O");
				turno = 1;
			}
			else {
				btnCinco.setLabel("X");
				turno = 0;
			}
			btnCinco.removeActionListener(null);
		}

		else if(e.getSource().equals(btnSeis)) {

			if(turno ==0) {
				btnSeis.setLabel("O");
				turno = 1;
			}
			else {
				btnSeis.setLabel("X");
				turno = 0;
			}
			btnSeis.removeActionListener(null);
		}

		else if(e.getSource().equals(btnSiete)) {

			if(turno ==0) {
				btnSiete.setLabel("O");
				turno = 1;
			}
			else {
				btnSiete.setLabel("X");
				turno = 0;
			}
			btnSiete.removeActionListener(null);
		}

		else if(e.getSource().equals(btnOcho)) {

			if(turno ==0) {
				btnOcho.setLabel("O");
				turno = 1;
			}
			else {
				btnOcho.setLabel("X");
				turno = 0;
			}
			btnOcho.removeActionListener(null);
		}

		else if(e.getSource().equals(btnNueve)) {

			if(turno ==0) {
				btnNueve.setLabel("O");
				turno = 1;
			}
			else {
				btnNueve.setLabel("X");
				turno = 0;
			}
			btnNueve.removeActionListener(null);
		}
		contador ++;
		comprobar();
	}

	private void comprobar() {

		if((btnUno.getLabel()==btnDos.getLabel())&&(btnDos.getLabel()==btnTres.getLabel()&&btnUno.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnUno.getLabel());
			fin = true;
		}

		else if((btnCuatro.getLabel()==btnCinco.getLabel())&&(btnCinco.getLabel()==btnSeis.getLabel()&&btnCuatro.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnCuatro.getLabel());
			fin = true;
		}
		else if((btnSiete.getLabel()==btnOcho.getLabel())&&(btnOcho.getLabel()==btnNueve.getLabel()&&btnSiete.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnSiete.getLabel());
			fin = true;
		}
		else if((btnUno.getLabel()==btnCuatro.getLabel())&&(btnCuatro.getLabel()==btnSiete.getLabel()&&btnUno.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnUno.getLabel());
			fin = true;
		}
		else if((btnDos.getLabel()==btnCinco.getLabel())&&(btnCinco.getLabel()==btnOcho.getLabel()&&btnDos.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnDos.getLabel());
			fin = true;
		}
		else if((btnTres.getLabel()==btnSeis.getLabel())&&(btnSeis.getLabel()==btnNueve.getLabel()&&btnTres.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnTres.getLabel());
			fin = true;
		}
		else if((btnUno.getLabel()==btnCinco.getLabel())&&(btnCinco.getLabel()==btnNueve.getLabel()&&btnUno.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnUno.getLabel());
			fin = true;
		}
		else if((btnTres.getLabel()==btnCinco.getLabel())&&(btnCinco.getLabel()==btnSiete.getLabel()&&btnTres.getLabel()!="")) {

			lblMensaje.setText("Gana " + btnTres.getLabel());
			fin = true;
		}

		else if(contador == 9)
		{
			lblMensaje.setText("Empate");
			dlgMensaje.add(lblMensaje);
			dlgMensaje.setVisible(true);
		}
		if(fin == true)
		{
			dlgMensaje.add(lblMensaje);
			dlgMensaje.setVisible(true);
		}
	}
}

