package es.studium.tema5;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8_awt implements WindowListener, ActionListener{

	Frame ventana = new Frame ("Menú");

	MenuBar barraMenu = new MenuBar ();

	Menu mnuArticulos = new Menu ("Artículos");	
	Menu mnuClientes = new Menu ("Clientes");
	Menu mnuFacturas = new Menu ("Facturas");


	MenuItem mniArticuloNuevo = new MenuItem ("Nuevo Artículo");
	MenuItem mniConsultarArticulo = new MenuItem ("Nuevo Artículo");
	MenuItem mnEliminaArticulo = new MenuItem ("Nuevo Artículo");

	MenuItem mniClienteNuevo = new MenuItem ("Cliente Nuevo");	
	MenuItem mniConsultarCliente = new MenuItem ("Consultar Cliente");
	MenuItem mniEliminarCliente = new MenuItem ("Eliminar Cliente");

	MenuItem mniNuevaFactura = new MenuItem ("Factura Nuevo");
	MenuItem mniConsultarFactura = new MenuItem ("Consultar Factura");

	Dialog dlgMensaje = new Dialog(ventana, "Ventana con mensaje", true);
	Label lblMensaje = new Label("");

	public Ejercicio8_awt() {

		ventana.addWindowListener(this);
		dlgMensaje.addWindowListener(this);


		mniArticuloNuevo.addActionListener(this);		
		mniConsultarArticulo.addActionListener(this);
		mnEliminaArticulo.addActionListener(this);

		mniClienteNuevo.addActionListener(this);
		mniConsultarCliente.addActionListener(this);
		mniEliminarCliente.addActionListener(this);

		mniNuevaFactura.addActionListener(this);
		mniConsultarFactura.addActionListener(this);



		ventana.setLayout(new FlowLayout());
		dlgMensaje.setLayout(new FlowLayout());


		barraMenu.add(mnuArticulos);
		mnuArticulos.add(mniArticuloNuevo);
		mnuArticulos.add(mniConsultarArticulo);
		mnuArticulos.add(mnEliminaArticulo);


		barraMenu.add(mnuClientes);
		mnuClientes.add(mniClienteNuevo);
		mnuClientes.add(mniConsultarCliente);
		mnuClientes.add(mniEliminarCliente);


		barraMenu.add(mnuFacturas);
		mnuFacturas.add(mniNuevaFactura);
		mnuFacturas.add(mniConsultarFactura);

		ventana.setMenuBar (barraMenu);

		ventana.setSize(450,170);
		ventana.setBackground(Color.gray);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

		dlgMensaje.setSize(200,150);
		dlgMensaje.setBackground(Color.gray);
		dlgMensaje.setResizable(false);
		dlgMensaje.setLocationRelativeTo(null);

		dlgMensaje.add(lblMensaje);
	}

	public static void main(String[] args) {

		new Ejercicio8_awt();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(mniArticuloNuevo)) {
			lblMensaje.setText("Artículo nuevo");
		}
		else if(e.getSource().equals(mniConsultarArticulo)) {
			lblMensaje.setText("Articulo eliminar");
		}
		else if(e.getSource().equals(mnEliminaArticulo)) {
			lblMensaje.setText("Articulo consultar");
		}
		else if(e.getSource().equals(mniClienteNuevo)) {
			lblMensaje.setText("Cliente nuevo");
			}
		else if(e.getSource().equals(mniConsultarCliente)) {
			lblMensaje.setText("Cliente eliminar");
		}
		else if(e.getSource().equals(mniEliminarCliente)) {
			lblMensaje.setText("Cliente consultar");
		}
		else if(e.getSource().equals(mniNuevaFactura)) {
			lblMensaje.setText("Factura Nuevo");
		}
		else if(e.getSource().equals(mniConsultarFactura)) {
			lblMensaje.setText("Consultar Factura");
		}
			dlgMensaje.setVisible(true);
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
