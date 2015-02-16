/**
* @author PIERRE KUNKEL
* @version 0.1 : Date : Wed Feb 04 13:47:34 CET 2015
*
*/

public class Test {
	public static void main(String args[]){
		try{
			Date d = new Date(1,2,3);
			System.out.println(d);
			Date d1 = new Date(0,2,3);
			System.out.println("oups c'est passé :p");
		}catch(InvalidDateException e){
			System.out.println(e);
		}

		try{
			Date d = new Date(0,0,3);
			System.out.println("oups c'est passé :p");
		}catch(InvalidDateException e){
			System.out.println(e);
		}

		try{
			Date d = new Date(1,0,2013);
			System.out.println("oups c'est passé :p");
		}catch(InvalidDateException e){
			System.out.println(e);
		}

		try{
			Date d = new Date(1,2,3);
			Date d1 = new Date(2,3,4);
			System.out.println(d.compareTo(d1));
			System.out.println(d.compareTo(d));
		}catch(InvalidDateException e){
			System.out.println(e);
		}
	}
}