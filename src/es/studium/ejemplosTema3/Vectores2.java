package es.studium.ejemplosTema3;
import java.util.Vector;
public class Vectores2
{
	public static void main(String[] args)
	{
		Vector<Integer> vector=new Vector<Integer>(10,1);
		for(int i = 0; i<15; i++)
		{
			vector.add(i);
			// Vamos mostrando el tamaño del vector
			System.out.print(vector.capacity()+" ");
		}
		System.out.println();
		// Mostramos el contenido del vector
		System.out.println(vector);
	}
}