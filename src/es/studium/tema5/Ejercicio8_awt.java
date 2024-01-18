package es.studium.tema5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8_awt implements WindowListener{
	
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


	
	public Ejercicio8_awt() {
		
		ventana.addWindowListener(this);
		
		ventana.setLayout(new FlowLayout());
		
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
	}

	public static void main(String[] args) {
		
		new Ejercicio8_awt();

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
