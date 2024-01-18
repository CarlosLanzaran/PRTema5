package es.studium.tema4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class Ejercicio7_awt {
	
	Frame ventana = new Frame ("Baloncesto");

	String[] Equipos = {"Seleccione un equipo", "Real Madrid","Barça","Iberoestar Tenerife","TD Systems Baskonia","Hereda San Pablo 	Burgos","Valencia Basket","Club Joventut de Badalona","Unicaja","UCAM Murcia","Baxi Manresa","MoraBanc Andorra","Herbalife Gran 	Canaria","Monbus Obradoiro","Movistar Estudiantes","Casademont Zaragoza","Urbas Fuenlabrada","Coosur Real Betis","RETAbet Bilbao 	Basket","Acunsa Gipuzkoa Basket"};
	
	
	List lstEquipos = new List(5, false);
	
	public Ejercicio7_awt(){
		
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

}
