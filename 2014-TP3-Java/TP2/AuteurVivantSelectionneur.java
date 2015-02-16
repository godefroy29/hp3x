/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 14:27:27 CET 2015
*
*/
public class AuteurVivantSelectionneur implements Selectionneur {

	private Date d1;

	public AuteurVivantSelectionneur(Date date)
	{
		d1=date;
	}

	public boolean estSatisfaitPar(Document d)
	{
		/**
		 * doit satisfaire un critère : auteur vivant
		 * @param Document
		 * @return boolean
		 */
		if((null == d.mortAut()) || (-1 > d1.compareTo(d.mortAut())))
		{
			return true;
		}
		return false;
	}
}