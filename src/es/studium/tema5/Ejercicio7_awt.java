package es.studium.tema5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio7_awt implements WindowListener{
	
	Frame ventana = new Frame ("Baloncesto");

	String[] Equipos = {"Seleccione un equipo", "Real Madrid","Barça","Iberoestar Tenerife","TD Systems Baskonia","Hereda San Pablo 	Burgos","Valencia Basket","Club Joventut de Badalona","Unicaja","UCAM Murcia","Baxi Manresa","MoraBanc Andorra","Herbalife Gran 	Canaria","Monbus Obradoiro","Movistar Estudiantes","Casademont Zaragoza","Urbas Fuenlabrada","Coosur Real Betis","RETAbet Bilbao 	Basket","Acunsa Gipuzkoa Basket"};
	
	
	List lstEquipos = new List(5, false);
	
	public Ejercicio7_awt(){
		
		ventana.addWindowListener(this);
		
		ventana.setLayout(new FlowLayout());
		
		for(int i = 0; i < Equipos.length; i++) {
			
			lstEquipos.add(Equipos[i]);
		}
		
		ventana.add(lstEquipos);
		
		ventana.setSize(450,170);
		ventana.setBackground(Color.blue);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
				
		new Ejercicio7_awt();
		
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
