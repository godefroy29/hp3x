/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Feb 02 17:35:19 CET 2015
*
*/
public class StrategieTypeTrois extends Strategie {
/*
 * @see Strategie
 */
	//methodes
	public int score(int valDe, Joueur [] joueurs, Joueur joueurActuel)
	{
		/*
		 * actualise les positions du dernier et premier
		 * @param valDe	valeur du de
		 * @param joueurs	tableau de Joueur
		 * @param joueurActuel	Joueur actuel
		 * @return res	valeur dont le joueur doit se deplacer
		 */
		this.premierDernierJoueurs(joueurs);
		int res = valDe + (joueurActuel.position() - min)/2;
		if (valDe < 3)
		{
			return res;
		}
		else
		{
			return res - res*2;
		}
	}
}