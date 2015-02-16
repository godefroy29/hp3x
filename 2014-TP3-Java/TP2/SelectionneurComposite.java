/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 15:45:50 CET 2015
*
*/
import java.util.*;
public class SelectionneurComposite implements Selectionneur{

	private ArrayList listeOfSelec = new ArrayList<Selectionneur>();

	public SelectionneurComposite(Selectionneur s1, Selectionneur s2)
	{
		listeOfSelec.add(s1);
		listeOfSelec.add(s2);
	}
	public SelectionneurComposite(Selectionneur s1)
	{
		listeOfSelec.add(s1);
	}

	public void add(Selectionneur s)
	{
		listeOfSelec.add(s);
	}
	public boolean estSatisfaitPar(Document d)
	{
		Iterator<Selectionneur> it = listeOfSelec.iterator();
		while(it.hasNext())
		{
			if (!it.next().estSatisfaitPar(d))
			{
				return false;
			}
		}
		return true;
	}	
}