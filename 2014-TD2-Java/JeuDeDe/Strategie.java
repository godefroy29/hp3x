/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Sun Feb 01 17:31:46 CET 2015
*
*/
abstract class Strategie {
	public int min;
	public int max;

	//methodes
	abstract int score(int valDe, Joueur [] joueurs, Joueur joueurActuel);
	
	public void premierDernierJoueurs(Joueur [] joueurs)
	{
		/*
		 * la classe strategie a besoin de connaitre le dernier et le premier.
		 * met l'indice du premier dans max et l'indice du dernier dans min.
		 * @param joueurs[]	tableau de joueurs
		 * @see Joueur
		 */
		min = 1;
		max = 1;
		for (int i = 1 ; i < 5 ; i++)
		{
			if (joueurs[i].position() > joueurs[max].position())
			{
				max = i;
			}
			if (joueurs[i].position() < joueurs[min].position())
			{
				min = i;
			}
		}
	}
}