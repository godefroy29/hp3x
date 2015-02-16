/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 14:27:43 CET 2015
*
*/
public class MotDansTitreSelectionneur implements Selectionneur {

	private String mot;

	public MotDansTitreSelectionneur(String s)
	{
		mot=s;
	}
	
	public boolean estSatisfaitPar(Document d)
	{
		/**
		 * doit satisfaire un critère : mot dans le titre
		 * @param Document
		 * @return boolean
		 */
		if(-1 < d.titre().indexOf(mot))
		{
			return true;
		}
		return false;
	}
}