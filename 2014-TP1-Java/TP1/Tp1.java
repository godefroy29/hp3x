/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Jan 19 09:54:36 CET 2015
*
*/
public class Tp1 {
	public static void main(String args[]){

		Point p1 = new Point(1, 2);
		Point p2 = new Point(4, 7);
		Point p3 = new Point(3, 9);
		Point p4 = new Point(1, 2);

		Droite d1 = new Droite(p1, p2);
		Droite d2 = new Droite(p2, p3);
		Droite d3 = new Droite(p3, p1);
		
		Triangle t1 = new Triangle(p1, p2, p3);
		Triangle t2 = new Triangle(d1, d2, d3);
		
		System.out.println("Distance p1 - p2 : " + p1.distance(p2));
		System.out.println("Distance p2 - p1 : " + p2.distance(p1));
		System.out.println("Distance p1 - p3 : " + p1.distance(p3));
		
		System.out.println("Test egalite p1 - p2 " + p1.equals(p2));
		System.out.println("Test egalite p2 - p1 " + p2.equals(p1));
		System.out.println("Test egalite p1 - p1 " + p1.equals(p1));
		System.out.println("Test egalite p1 - p4 " + p1.equals(p4));
		
		System.out.println("Coordonnees d1 : (" + d1.getA() + " : " + d1.getB() + ")");
		System.out.println("Coordonnees d2 : (" + d2.getA() + " : " + d2.getB() + ")");

		System.out.print("Point du triangle t1 :");
		t1.affiche();System.out.println();
		System.out.println("Perimetre du triangle t1 : (" + t1.perimetre() + ")");
		System.out.println("Surface du triangle t1 : (" + t1.aire() + ")");
		
		System.out.print("Point du triangle t2 :");
		t2.affiche();System.out.println();
		System.out.println("Perimetre du triangle t2 : (" + t2.perimetre() + ")");
		System.out.println("Surface du triangle t2 : (" + t2.aire() + ")");

		System.out.println("p1 appartient a d1 : " + d1.estSurDroite(p1));
		System.out.println("p1 appartient a d2 : " + d2.estSurDroite(p1));
	}
}