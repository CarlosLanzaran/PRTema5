package es.studium.ejemplosTema3;
import java.util.Vector;
public class vectores
{
	public static void main(String args[])
	{
		int i;
		Vector<Integer> v=new Vector<Integer>();
		for(i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
	}
}