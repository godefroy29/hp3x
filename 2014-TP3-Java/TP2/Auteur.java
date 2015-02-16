/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 04 14:55:00 CET 2015
*
*/
public class Auteur{
	//variables d'instances
	private String nom;
	private Date naissance;
	private Date deces;

	public String nom(){return nom;}
	public Date naissance(){return naissance;}
	public Date deces(){return deces;}

	//constructeur
	public Auteur(String name, Date birth, Date death)
	{
		/**
		 * Utilisee quand il y a une date de deces
		 * @param name	son nom
		 * @param birth	date de naissance
		 * @param deces	date de deces
		 */
		nom = name;
		naissance = birth;
		deces = death;
	}
	public Auteur(String name, Date birth)
	{
		/**
		 * Utilisee quand il n'y a pas de date de deces
		 * @param name	son nom
		 * @param birth	date de naissance
		 */
		nom = name;
		naissance = birth;
		deces = null;
	}

	//methodes
	public boolean equals(Auteur a1)
	{
		/**
		 * @param a1	auteur a comparer avec this
		 * @return bool	
		 */
		 if(this.deces == null && a1.deces() == null)
		 {
		 	return this.nom.equals(a1.nom()) && this.naissance.equals(a1.naissance());
		 }
		 if(this.deces == null || a1.deces() == null)
		 {
		 	return false;
		 }
		 return this.nom.equals(a1.nom()) && this.naissance.equals(a1.naissance()) && this.deces.equals(a1.deces());
	}

	public String toString()
	{
		return nom+" ("+naissance+")/("+deces+")";
	}
}