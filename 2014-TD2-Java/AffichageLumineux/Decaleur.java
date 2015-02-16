/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Tue Feb 03 17:56:28 CET 2015
*
*/
public class Decaleur {
	//variables d'instance
	private int largeurL;
	private char [] tabChar;

	//constructeur
	public Decaleur(int largeur)
	{
		/*
		 * @param largeur	longueur du decaleur
		 */
		largeurL = largeur;
		tabChar = new char[largeurL];
		java.util.Arrays.fill(tabChar,' ');
	}
	
	//methodes d'instance
	public int getLargeur()
	{
		/*
		 * permet de recuperer la valeur du decaleur
		 * @return largeurL	longueur du decaleur
		 */
		return largeurL;
	}

	public void raz()
	{
		/*
		 * place des ' ' dans chaque case de tabChar
		 */
		java.util.Arrays.fill(tabChar,' ');
	}

	public char decale(char caracDroite)
	{
		/*
		 * decale le tableau de char en sortant le plus a gauche et en fesant entrer le parametre
		 * @param caracDroite	le caractere qui sera le plus a droite dans le decaleur
		 * @return caracGauche	le caractere sortant du decaleur
		 */
		char caracGauche = tabChar[0];
		for (int i = 0; i < largeurL-1 ; i++)
		{
			tabChar[i] = tabChar[i+1];
		}
		tabChar[largeurL-1] = caracDroite;
		return caracGauche;
	}

	public String toString()
	{
		/*
		 * @return String(tabChar)	tabChar dans une string
		 */
		return new String(tabChar);
	}
}