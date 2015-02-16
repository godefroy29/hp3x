/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 04 15:12:57 CET 2015
*
*/
public class Document {

	//variables d'instances
	private boolean dispo;
	private String titre;
	private Auteur aut;

	//constructeur
	public Document(String title, Auteur writter)
	{
		aut=writter;
		titre=title;
		dispo=true;
	}

	public String toString()
	{
		return "titre =>"+titre+"\nauteur => "+aut;
	}

	public void retour()
	{
		dispo=true;
	}
	public void emprunt()
	{
		dispo=false;
	}

	public boolean dispo()
	{
		return dispo;
	}
	 public Date mortAut()
	 {
	 	return aut.deces();
	 }
	 public String titre()
	 {
	 	return titre;
	 }
	
}