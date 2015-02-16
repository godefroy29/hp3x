/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 04 15:48:44 CET 2015
*
*/

import java.util.*;

 public class BaseDocuments
{
	private List<Document> listDoc;

	public BaseDocuments()
	{
		this.listDoc = new ArrayList<Document>();
	}

	public void ajoute(Document d)
	{
		/** ajoute un document dans la base de documents
	    * @param d le document à ajouter
	    */
	    listDoc.add(d);
	}

	public Document supprime(Document d)
	{
		/** supprime un document de la base de documents (si il est plusieurs
	    * fois présents, une seule des occurrences est supprimée). Il
	    * importe peu que le document soit emprunté ou non au moment de sa
	    * suppression.
	    * @param d le document à supprimer
	    * @return le document supprimé, null s’il n’existe pas
	    */

		if(!listDoc.remove(d))
		{
			return null;
		}
		return d;
	}

	public void affiche()
	{
		/** affiche tous les documents de la mediathèque (pour impression
	    * du catalogue par exemple)
	    */
	    for(int i = 0; i < listDoc.size(); i++)
	    {
	    		System.out.print(i);
	    		System.out.print(" ");
	    		System.out.println(listDoc.get(i));
	    }
	}

	public boolean estDisponible(Document d) throws NoSuchElementException
	{ 
		/** indique si le document donné est disponible (non emprunté)
	    * @param d le document concerné
	    * @return true si le document donné est disponible (non emprunté)
	    * @exception NoSuchElementException si le document n’existe
	    * pas dans la mediathèque
	    */
	    if(-1 != listDoc.indexOf(d))
	    {
	    		return listDoc.get(listDoc.indexOf(d)).dispo();
	    }
	    throw new NoSuchElementException();
	    
	}

	public boolean emprunte(Document d) throws NoSuchElementException
	{
		 /** permet d’emprunter un document
	    * @param d le document concerné
	    * @exception NoSuchElementException si le document n’existe
	    * pas dans la mediathèque
	    * @return true si le document donné était disponible et a pu être emprunté
	    */

	    if (!listDoc.contains(d))
	    {
	    		throw new NoSuchElementException();
	    }
	    Iterator<Document> it = listDoc.iterator();
	    while(it.hasNext())
	    {
	    		Document a = it.next();
	    		if(d.equals(a) && a.dispo())
	    		{
	    			a.emprunt();
	    		}
	    }
	    return false;
	}
   
      
	public void rend(Document d)
	{
	
		/** permet de rendre un document
	    * @param d le document concerné
	    */
	    Iterator<Document> it = listDoc.iterator();
	    while(it.hasNext())
	    {
	    		Document a = it.next();
	    		if(d.equals(a) && !a.dispo())
	    		{
	    			a.retour();
	    		}
	    }
	}
	
	public Iterator selectionne(Selectionneur s)
	{
		ArrayList<Document> bd = new ArrayList();
		Iterator<Document> itBd = bd.iterator();
		Document temp;
		Iterator<Document> it = listDoc.iterator();
	     while(it.hasNext())
	     {
	     	temp = it.next();
	    		if(s.estSatisfaitPar(temp))
	    		{
	    			bd.add(temp);
	    		}
	     }
	     return bd.iterator();
	}
}
