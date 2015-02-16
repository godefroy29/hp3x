/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 04 13:38:29 CET 2015
*
*/
public class Date implements Comparable<Date>{
	//variables d'instance
	private int jour;
	private int mois;
	private int annee;

	//constructeur
	public Date(int j, int m, int a) throws InvalidDateException
	{
		/**
		 * @param j	le jour
		 * @param m	le mois
		 * @param a	l'annee
		*/

		if(j<1 || j>31 || m<1 || m>12)
		{
			throw new InvalidDateException();
		}
		jour = j;
		mois = m;
		annee = a;
	}

	//methodes
	public String toString()
	{
		return String.format("%d/%d/%d",jour,mois,annee);
	}

	public int compareTo(Date d1)
	{
		/**
		 * @param d1	date a comparer avec this
		 * @return int	negatif si this inf. d1, positif si this sup. d1, null sinon
		 */
		if(this.annee != d1.annee)
		{
			return this.annee - d1.annee;
		}
		if(this.mois != d1.mois)
		{
			return this.mois - d1.mois;
		}
		if(this.jour != d1.jour)
		{
			return this.jour - d1.jour;
		}
		return 0;
	}

	public boolean equals(Date d1)
	{
		/**
		 * @param d1	date a comparer avec this
		 * @return bool	
		 */
		return !(this.annee != d1.annee || this.mois != d1.mois || this.jour != d1.jour);
	}
}