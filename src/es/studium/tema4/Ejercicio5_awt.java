package es.studium.tema4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ejercicio5_awt {
	
	
	
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



	public Ejercicio5_awt() {
		
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
		
		ventana.add("South", pnlBoton);


		ventana.setSize(450,170);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	

	public static void main(String[] args) {

		new Ejercicio5_awt();

	}

}
