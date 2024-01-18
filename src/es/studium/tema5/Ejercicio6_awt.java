package es.studium.tema5;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6_awt implements WindowListener{
	
	
	Frame ventana = new Frame ("Provincias");
	
	Choice choProvincias = new Choice();
	
	String[ ] provincias = {"Seleccione una provincia", "Álava","Albacete", "Alicante", "Almería", "Asturias", "Ávila","Badajoz",
			"Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona",
			"Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga",
			"Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria",
			"Tarragona", "Santa Cruz de Tenerife", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"};
	
	
	public Ejercicio6_awt() {
		
		ventana.addWindowListener(this);
		
		ventana.setLayout(new FlowLayout());
		
		for(int i = 0; i < provincias.length; i++) {
			
			choProvincias.add(provincias[i]);
		}
		
		/*for(String provincia: provincias) {
			
			choProvincias.add(provincia);

		}*/
		
		ventana.add(choProvincias);
		
		ventana.setSize(450,170);
		ventana.setBackground(Color.red);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	


	public static void main(String[] args) {
		
		new Ejercicio6_awt();
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
