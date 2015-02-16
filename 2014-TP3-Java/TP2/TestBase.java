/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 13:40:17 CET 2015
*
*/
import java.util.*;
public class TestBase {
	public static void main(String[] args)
	{
		try
		{
			Date d1 = new Date(1,1,1998);
			Date d2 = new Date(1,1,2013);
			Date d3 = new Date(1,1,2015);
			Date d4 = new Date(1,1,2005);
			Auteur a1 = new Auteur("Wriggles",d1,null);
			Auteur a2 = new Auteur("Manau",d1,d2);
			Auteur a3 = new Auteur("Un prof",d1,d3);
			Document doc1 = new Document("La tribue de Dana",a2);
			Document doc2 = new Document("Poupine et Thierry",a1);
			Document doc3 = new Document("Julie la petite olive",a1);
			Document doc4 = new Document("Le polymorphisme",a3);
			BaseDocuments bd = new BaseDocuments();
			bd.ajoute(doc1);
			bd.ajoute(doc2);
			bd.ajoute(doc3);
			bd.ajoute(doc4);
			bd.affiche();
			bd.supprime(doc1);
			bd.affiche();
			bd.ajoute(doc1);
			bd.affiche();
			System.out.println("est dispo ?");
			System.out.println(bd.estDisponible(doc2));
			System.out.println("on l'emprunte, test si dispo");
			bd.emprunte(doc2);
			System.out.println(bd.estDisponible(doc2));
			bd.rend(doc2);
			System.out.println("on le rend, test si dispo");
			System.out.println(bd.estDisponible(doc2));

			System.out.println();
			System.out.println("test des selectionneur avec pour mot 'la'");
			bd.emprunte(doc1);
			bd.emprunte(doc2);
			NonEmprunteSelectionneur s1 = new NonEmprunteSelectionneur();
			AuteurVivantSelectionneur s2 = new AuteurVivantSelectionneur(d2);
			MotDansTitreSelectionneur s3 = new MotDansTitreSelectionneur("la");
			AuteurVivantSelectionneur s4 = new AuteurVivantSelectionneur(d4);
			MotDansTitreSelectionneur s5 = new MotDansTitreSelectionneur("polymorphisme");


			System.out.println("s1 => non emprunte");
			System.out.println("s2 => auteur vivant");
			System.out.println("s3 => 'la'");

			bd.affiche();

			Iterator<Document> it1 = bd.selectionne(s1);
			Iterator<Document> it2 = bd.selectionne(s2);
			Iterator<Document> it3 = bd.selectionne(s3);
			Iterator<Document> it4 = bd.selectionne(s4);
			Iterator<Document> it5 = bd.selectionne(s5);


			System.out.println();
			System.out.println("test s1 => non emprunte");
			while(it1.hasNext())
		    	{
		    		Document a = it1.next();
		    		System.out.println(a);
		    	}

			System.out.println();
		     System.out.println("test s2 => auteur vivant");
		     while(it2.hasNext())
		     {
		    		System.out.println(it2.next());
		     }


			System.out.println();
		     System.out.println("test s3 => 'la'");
		     while(it3.hasNext())
		     {
		    		System.out.println(it3.next());
		     }

		     System.out.println();
		     System.out.println("test s4 => 01/01/2005");
		     while(it4.hasNext())
		     {
		    		System.out.println(it4.next());
		     }

		     System.out.println();
		     System.out.println("test s5 => 'polymorphisme'");
		     while(it5.hasNext())
		     {
		    		System.out.println(it5.next());
		     }

			System.out.println();
		     System.out.println("test sc1 => s4 + s5");
		     SelectionneurComposite sc1 = new SelectionneurComposite(s4);
		     sc1.add(s5);
		     Iterator<Document> it6 = bd.selectionne(sc1);
		     while(it6.hasNext())
		     {
		    		System.out.println(it6.next());
		     }
		     
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		//int p = d1.compareTo(i);
		
	}
}