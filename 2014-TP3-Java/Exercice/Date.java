/**
* @author PIERRE KUNKEL
* @version 0.1 : Date : Wed Feb 04 13:37:38 CET 2015
*
*/

public class Date implements Comparable{

	// Variable d'instances

	private int jour;
	private int mois;
	private int annee;

	// Constructeur

	public Date(int j,int m, int a) throws InvalidDateException {
		if(j < 32 && j > 0){
			jour=j;}
		else{
			throw new InvalidDateException(1);
		}
		if(m < 13 && m > 0){
			mois=m;}
		else{
			throw new InvalidDateException(2);
		}
		annee=a;
	}

	// Accesseurs

	public int getJour(){
		return jour;
	}

	public int getMois(){
		return mois;
	}

	public int getAnnee(){
		return annee;
	}

	// Methode

	// Redéfinition

	public String toString(){
		return "Date : "+jour+"/"+mois+"/"+annee;
	}

	public int compareTo(Object obj){
		Date d = (Date) obj;

		if( annee != d.annee){
			return annee - d.annee;
		}else if( mois != d.mois){
			return mois - d.mois;
		}else{
			return jour - d.jour;
		}
	}

	public boolean equals(Object obj){
		if(obj instanceof Date){
			
			Date d = (Date) obj;
			
			if((annee == d.getAnnee()) && (mois == d.getMois()) && jour == d.getJour()){
				return true; 
			}
		}
		return false;
	}
}