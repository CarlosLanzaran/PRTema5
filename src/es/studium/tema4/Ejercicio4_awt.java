package es.studium.tema4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ejercicio4_awt {
	
	Frame ventana = new Frame ("Aficiones");
	
	Button btnBoton = new Button ("          Comprobar          ");
	
	Checkbox chkCorrer = new Checkbox ("Correr");
	Checkbox chkNadar = new Checkbox ("Nadar");
	Checkbox chkAndar = new Checkbox ("Andar");
	Checkbox chkLeer = new Checkbox ("Leer");
	Checkbox chkCine = new Checkbox ("Ir al cine");
	Checkbox chkBailar = new Checkbox ("Bailar");
	Checkbox chkFutbol = new Checkbox ("Fútbol");
	Checkbox chkTenis = new Checkbox ("Tenis");
	Checkbox chkBaloncesto = new Checkbox ("Baloncesto");
	Checkbox chkVela = new Checkbox ("Deportes de Vela");


	public Ejercicio4_awt() {
		
		ventana.setLayout(new FlowLayout());
		ventana.add(chkCorrer);
		ventana.add(chkNadar);
		ventana.add(chkAndar);
		ventana.add(chkLeer);
		ventana.add(chkCine);
		ventana.add(chkBailar);
		ventana.add(chkFutbol);
		ventana.add(chkTenis);
		ventana.add(chkBaloncesto);
		ventana.add(chkVela);
		ventana.add(btnBoton);


		ventana.setSize(280,150);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	
	
public static void main(String[] args) {
		
		new Ejercicio4_awt();

	}

}
