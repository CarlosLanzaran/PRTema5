package es.studium.tema5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4_awt implements WindowListener, ActionListener{
	
	Frame ventana = new Frame ("Aficiones\n");
	
	Button btnBoton = new Button ("            	     Comprobar           	    ");
	
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
	
	TextArea txaResultado = new TextArea(10,50);


	public Ejercicio4_awt() {
		
		ventana.addWindowListener(this);

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
		
		ventana.add(txaResultado);
		
		btnBoton.addActionListener(this);
		
		ventana.setSize(440,300);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	
	
public static void main(String[] args) {
		
		new Ejercicio4_awt();

	}


@Override
public void actionPerformed(ActionEvent e) {
	
	if(chkCorrer.getState()==true)
	{
		txaResultado.append("Correr\n");
	}
	if(chkNadar.getState())
	{
		txaResultado.append("Nadar\n");;
	}
	if(chkAndar.getState())
	{
		txaResultado.append("Andar\n");
	}
	if(chkLeer.getState())
	{
		txaResultado.append("Leer\n");
	}
	if(chkCine.getState())
	{
		txaResultado.append("Ir al cine\n");
	}
	if(chkBailar.getState())
	{
		txaResultado.append("Bailar\n");
	}
	if(chkFutbol.getState())
	{
		txaResultado.append("Fútbol\n");
	}
	if(chkTenis.getState())
	{
		txaResultado.append("Tenis\n");
	}
	if(chkBaloncesto.getState())
	{
		txaResultado.append("Baloncesto\n");
	}
	if(chkVela.getState())
	{
		txaResultado.append("Deportes de Vela\n");
	}
	
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
