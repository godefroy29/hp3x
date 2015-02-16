/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Tue Feb 03 17:56:53 CET 2015
*
*/
public class Vitesse extends Latence{
	private int vit;

	public Vitesse(int largeur, int duree, int v)
	{
		/*
		 * @param v	vitesse de defilement
		 */
	 	super(largeur,duree);
	 	vit=v;
	}
	public char top()
	{
		/*
		 * @return sortant	le dernier caractere sortant du decaleur
		 */
		char sortant = ' ';
		for(int i = 0; i < vit; i++)
		{
			sortant = leDecaleur.decale(texte[indiceProchain]);
			indiceProchain ++;
			if (indiceProchain == taille)
			{
				indiceProchain = 0;
			}
		}
		return sortant;
	}
}