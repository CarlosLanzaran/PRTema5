package es.studium.ejemplosTema3;
import java.util.BitSet;
public class Bitsets
{
	public static void main(String args[])
	{
		BitSet bset = new BitSet(4);
		bset.set(0);
		bset.clear(1);
		bset.set(2);
		bset.set(3);
		System.out.println("BitSet 1");
		for(int i=0;i<4;i++)
		{
			System.out.println(bset.get(i)+ " ");
		}
		BitSet bset2 = new BitSet(4);
		bset2.set(0);
		bset2.set(1);
		bset2.clear(2);
		bset2.set(3);
		System.out.println("BitSet 2");
		for(int i=0;i<4;i++)
		{
			System.out.println(bset2.get(i) + " ");
		}
		bset.and(bset2);
		System.out.println("BitSet 1 AND BitSet 2");
		for(int i=0;i<4;i++)
		{
			System.out.println(bset.get(i)+"");
		}
	}
}