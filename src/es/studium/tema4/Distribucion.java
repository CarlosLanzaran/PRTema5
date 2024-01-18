package es.studium.tema4;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;

public class Distribucion
{
	Frame ventana = new Frame("Ejemplo GridBagLayout");
	GridBagConstraints constraints = new GridBagConstraints();
	TextArea txtArea = new TextArea("Tu mamá es fea");
	Button btnBoton1 = new Button ("Botón 1"); 
	Button btnBoton2 = new Button ("Botón 2");
	Button btnBoton3 = new Button ("Botón 3");
	Button btnBoton4 = new Button ("Botón 4");
	TextField txtCampo = new TextField ("Campo texto");




	public Distribucion()
	{
		ventana.setLayout (new GridBagLayout());

		//Establecer restricciones/propiedades
		constraints.gridx = 0; 
		constraints.gridy = 0; 
		constraints.gridwidth = 2; 
		constraints.gridheight = 2; 
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weighty = 1.0;
		
		//Aplicar a un componente
		//Aplicar el componente 
		ventana.add(txtArea, constraints);
		constraints.weighty = 0.0; 

		constraints.gridx = 2; 
		constraints.gridy = 0; 
		constraints.gridwidth = 1; 
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.NORTH;
		constraints.fill = GridBagConstraints.NONE;
		constraints.weighty = 1.0; 
		ventana.add(btnBoton1, constraints);
		constraints.weighty = 0.0;


		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 1.0; 
		ventana.add(btnBoton2, constraints);
		constraints.anchor = GridBagConstraints.NORTH;
		constraints.weighty = 0.0; 

		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		ventana.add(btnBoton3, constraints);
		constraints.weighty = 1.0;

		
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		ventana.add(btnBoton4, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.weighty = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		ventana.add (txtCampo, constraints);

		
		ventana.setSize(550,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Distribucion();
	}
}