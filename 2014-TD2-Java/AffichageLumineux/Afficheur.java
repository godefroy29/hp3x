/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Tue Feb 03 17:56:34 CET 2015
*
*/
public class Afficheur {
	/*variables d'instance
	 * @see Decaleur
	 */
	protected char [] texte;
	protected int taille;
	protected int indiceProchain;
	protected Decaleur leDecaleur;

	//constructeur
	public Afficheur(int largeur)
	{
		/*
		 * @param largeur	largeur du décaleur
		 */
		 taille = 0;
		 indiceProchain = 0;
		 leDecaleur = new Decaleur(largeur);
	}
	
	//methodes d'instance
	public void setMessage(char[] message)
	{
		/*
		 * @param message	le message a utiliser
		 */
		 taille = message.length;
		 texte = new char[taille];
		 System.arraycopy(message, 0, texte, 0, taille);
		 indiceProchain = 0;
	}

	public char top()
	{
		/*
		 * @return sortant	le dernier caractere sortant du decaleur
		 */
		char sortant = leDecaleur.decale(texte[indiceProchain]);
		indiceProchain ++;
		if (indiceProchain == taille)
		{
			indiceProchain = 0;
		}
		return sortant;
	}
	public String toString()
	{
		return leDecaleur.toString();
	}
}