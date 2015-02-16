/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Feb 02 17:35:12 CET 2015
*
*/
public class StrategieTypeDeux extends Strategie {
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
		if ((valDe % 2) == 1)
		{
			return valDe;
		}
		else
		{
			return valDe * 3;
		}
	}
}