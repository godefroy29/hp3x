/**
* @author PIERRE KUNKEL
* @version 0.1 : Date : Wed Feb 04 15:00:33 CET 2015
*
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BaseDocuments
{
   
	private List<Document> listeDocs;

	public BaseDocuments(){
	 	listeDocs = new ArrayList<Document>();
	}


    /** ajoute un document dans la base de documents
    * @param d le document à ajouter
    */
    	public void ajouter(Document d){
		listeDocs.add(d);
    	}
    /** supprime un document de la base de documents (si il est plusieurs
    * fois présents, une seule des occurrences est supprimée). Il
    * importe peu que le document soit emprunté ou non au moment de sa
    * suppression.
    * @param d le document à supprimer
    * @return le document supprimé, null s’il n’existe pas
    */
	public Document supprime(Document d){
		if(listeDocs.remove(d)){
			return d;
		}else{
			return null;
		}
	}

    /** affiche tous les documents de la mediathèque (pour impression
    * du catalogue par exemple)
    */
	public void affiche(){
		Iterator<Document> it = listeDocs.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
       

    /** indique si le document donné est disponible (non emprunté)
    * @param d le document concerné
    * @return true si le document donné est disponible (non emprunté)
    * @exception NoSuchElementException si le document n’existe
    * pas dans la mediathèque
    */
       // COMPLETER méthode estDisponible

	public boolean estDisponible(Document d) throws NoSuchElementException{
		if (!listeDocs.contains(d))
			throw new NoSuchElementException();
		
		Iterator<Document> it = listeDocs.iterator();

		while(it.hasNext()){
			Document e= it.next();
			if(d.equals(e)){
				return e.getStatut();
			}
		}
		return false;
	}
    /** permet d’emprunter un document
    * @param d le document concerné
    * @exception NoSuchElementException si le document n’existe
    * pas dans la mediathèque
    * @return true si le document donné était disponible et a pu être emprunté
    */
     public boolean emprunte(Document d) throws NoSuchElementException{
		if (!listeDocs.contains(d))
			throw new NoSuchElementException();
		
		Iterator<Document> it = listeDocs.iterator();

		while(it.hasNext()){
			Document e= it.next();
			if(d.equals(e)){
				if(e.getStatut()){
					e.changeStatut();
					return true;
				}
			}
		}
		return false;
	}
	
    /** permet de rendre un document
    * @param d le document concerné
    */
     public void rend(Document d) {
		Iterator<Document> it = listeDocs.iterator();

		while(it.hasNext()){
			Document e= it.next();
			if(d.equals(e)){
				if(!e.getStatut()){
					e.changeStatut();
				}
			}
		}
	}
}