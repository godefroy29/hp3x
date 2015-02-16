/**
* @author PIERRE KUNKEL
* @version 0.1 : Date : Wed Feb 04 14:46:38 CET 2015
*
*/
public class Auteur {
	
	// Variables d'instances
	
	private String nom;
	private Date birthDate;
	private Date deathDate;

	// Constructeurs

	public Auteur(String n,Date bD,Date dD){
		nom = n;
		birthDate = bD;
		deathDate = dD;
	}

	public Auteur(String n,Date bD){
		nom = n;
		birthDate = bD;
		deathDate = null;
	}

	// Accesseurs

	public String getNom(){
		return nom;

		
	}

	public Date getBirthDate(){
		return birthDate;
	}

	public Date getDeathDate(){
		return deathDate;
	}

	// Methode 

	// Redefinition

	public boolean equals(Object obj){
		if(obj instanceof Auteur){
			Auteur a = (Auteur) obj;
			if((nom == a.getNom()) && (birthDate.equals(a.getBirthDate())) && (deathDate.equals(a.getDeathDate())) ){
				return true;
			}
		}
		return false;
	}
}