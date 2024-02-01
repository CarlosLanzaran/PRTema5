package es.studium.tema5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5_awt implements WindowListener, ActionListener{
	
	
	
	Frame ventana = new Frame ("Coches");
	
	Panel pnlDatos = new Panel();
	Panel pnlBoton = new Panel();

		
	Label lblNombre = new Label ("Tipo de motorización");
	Label lblNombre2 = new Label ("Número de puerteas");
	Label lblNombre3 = new Label ("Pintura Metalizada");
	
	CheckboxGroup chgMotor = new CheckboxGroup ();
	Checkbox chkDiesel = new Checkbox ("Diesel", false, chgMotor);
	Checkbox chkGasolina = new Checkbox ("Gasolina", false, chgMotor);
	Checkbox chkHibrido = new Checkbox ("Hibrido", false, chgMotor);
	Checkbox chkElectrico = new Checkbox ("Electrico", false, chgMotor);
	
	CheckboxGroup chgPuertas = new CheckboxGroup ();
	Checkbox chk3 = new Checkbox ("3 puertas", false, chgPuertas);
	Checkbox chk4 = new Checkbox ("4 puertas", false, chgPuertas);
	Checkbox chk5 = new Checkbox ("5 puertas", false, chgPuertas);
	
	CheckboxGroup chgPintura = new CheckboxGroup ();
	Checkbox chksi = new Checkbox ("Sí", false, chgPintura);
	Checkbox chkno = new Checkbox ("No", false, chgPintura);
	
	Button btnBoton = new Button ("Calcular presupuesto");
	
	TextField txtResultado = new TextField(10);




	public Ejercicio5_awt() {
		
		ventana.addWindowListener(this);
		
		btnBoton.addActionListener(this);
		
		ventana.setLayout(new BorderLayout());
		
		pnlDatos.add(lblNombre);
		pnlDatos.add(chkDiesel);
		pnlDatos.add(chkGasolina);
		pnlDatos.add(chkHibrido);
		pnlDatos.add(chkElectrico);
		
		pnlDatos.add(lblNombre2);
		pnlDatos.add(chk3);
		pnlDatos.add(chk4);
		pnlDatos.add(chk5);
		
		pnlDatos.add(lblNombre3);
		pnlDatos.add(chksi);
		pnlDatos.add(chkno);
		
		ventana.add("Center", pnlDatos);
		
		pnlBoton.add(btnBoton);
		pnlBoton.add(txtResultado);
		
		ventana.add("South", pnlBoton);


		ventana.setSize(450,170);
		ventana.setBackground(Color.blue);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	

	public static void main(String[] args) {

		new Ejercicio5_awt();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int presupuesto = 0;
		if(chkDiesel.getState()==true) {
			presupuesto = presupuesto + 8000;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chkGasolina.getState()==true) {
			presupuesto = presupuesto + 7000;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chkHibrido.getState()==true) {
			presupuesto = presupuesto + 9000;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chkElectrico.getState()==true) {
			presupuesto = presupuesto + 8500;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chk3.getState()==true) {
			presupuesto = presupuesto + 2000;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chk4.getState()==true) {
			presupuesto = presupuesto + 3000;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chk5.getState()==true) {
			presupuesto = presupuesto + 2500;
		}
		else {
			presupuesto = presupuesto + 0;
		}
		if(chksi.getState()==true) {
			presupuesto = presupuesto + 1500;
		}
		else {
			presupuesto = presupuesto + 0;

		}
		txtResultado.setText(presupuesto + " €");
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
