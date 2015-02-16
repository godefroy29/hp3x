/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Feb 02 17:35:06 CET 2015
*
*/
import java.util.Collections;
import java.util.Arrays;

public class StrategieTypeUne extends Strategie {
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
		int res = valDe + (max - min)/2;
		if (valDe > 2)
		{
			return res;
		}
		else
		{
			return res - res*2;
		}
	}
}