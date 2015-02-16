/**
* @author PIERRE KUNKEL
* @version 0.1 : Date : Wed Feb 04 14:07:07 CET 2015
*
*/
public class InvalidDateException extends Exception{

	protected int num;

	public InvalidDateException(int num){
		this.num = num;
	}

	public String toString(){
		if (num == 1){
			return "Erreur création date : Jour invalide";
		}else if(num == 2) {
			return "Erreur création date : Mois invalide";
		}else{
			return "Erreur date invalide";
		}
	}
}