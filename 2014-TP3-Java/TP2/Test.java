/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 04 14:54:05 CET 2015
*
*/
public class Test {
	//main
	public static void main(String[] args)
	{
		try
		{
			Date d1 = new Date(1,1,1998);
			Date d2 = new Date(1,1,2013);
			System.out.println(d1);
			System.out.println(d2);	
			System.out.println(d1.compareTo(d2));
			//Date dTest = new Date(1,0,1999);

			Auteur a1 = new Auteur("plop",d1,null);
			Auteur a2 = new Auteur("Manau",d1,d2);
			System.out.println(a1.equals(a2));

			Document doc1 = new Document("La tribue de Dana",a2);
			System.out.println(doc1);
		}
		catch(InvalidDateException e)
		{
			System.out.println(e);
		}
		//int p = d1.compareTo(i);
		
	}
}