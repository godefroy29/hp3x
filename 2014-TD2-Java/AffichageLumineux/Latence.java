/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Tue Feb 03 17:56:49 CET 2015
*
*/
public class Latence extends Afficheur
{
	protected int lag;
	//constructeur
	public Latence(int largeur, int duree)
	{
		/*
		 * @see Afficheur
		 * @param duree	duree de latence
		 */
		super(largeur);
		lag = duree;
	}

	//methodes
	public void setMessage(char[] message)
	{
		/*
		 * @param message 	on rajoute a ce message des ' ' pour le decalage/latence
		 */
		taille = message.length + lag;
		texte = new char[taille];
		indiceProchain = 0;
		for (int i = 0; i < taille-lag; i++)
		{
			texte[i] = message[i];
		}
		for(int i = (taille-lag); i < taille; i++)
		{
			texte[i] = ' ';
		}
		System.out.print("texte => ");
		for(int i = 0; i < taille; i++)
		{
			System.out.print(texte[i]);
		}
		System.out.println("|");
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
}