/**
* @author PIERRE KUNKEL
* @version 0.1 : Date : Wed Feb 04 15:02:31 CET 2015
*
*/
public class Document {

	// Variables d'instances

	private Auteur auteur;
	private String titre;
	private boolean statut;

	// Constructeur

	public Document(String t,Auteur a){
		auteur = a;
		titre = t;
		statut = true;
	}

	// Accesseur

	public Auteur getAuteur(){
		return auteur;
	}

	public String getTitre(){
		return titre;
	}

	public boolean getStatut(){
		return statut;
	}

	// Methode

	public void changeStatut(){
		statut = !statut;
	}

	// Redefinition

	public boolean equals(Object obj){
		if(obj instanceof Document){
			Document d = (Document) obj;
			if((titre == d.getTitre()) && (auteur.equals(d.getAuteur()))){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		return titre+" Auteur : "+ auteur.getNom(); 
	}
}