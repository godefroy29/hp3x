/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 14:27:15 CET 2015
*
*/
public class NonEmprunteSelectionneur implements Selectionneur {
	
	public boolean estSatisfaitPar(Document d)
	{
		/**
		 * doit satisfaire un critère : livre dispo
		 * @param Document
		 * @return boolean
		 */
		return d.dispo();
	}
		
}