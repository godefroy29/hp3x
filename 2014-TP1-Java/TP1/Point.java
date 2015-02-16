/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Jan 19 09:05:57 CET 2015
*
*/
import java.lang.Math;
public class Point {
//variable d'instance
	private double x;
	private double y;
//constructeur
	public Point(double x, double y)
	{
		/**
		 * Creation d'un point avec deux reels
		 * @param x 	un reel representant l'abscisse
		 * @param y 	un reel representant l'ordonnee
		 */
		this.x=x;
		this.y=y;
	}
	public double absc()
	{
		/**
		 * Retourne l'abscisse du point recepteur du message
		 * @return x 	l'abscisse
		 */
		return x;
	}
	public double ordo()
	{
		/**
		 * Retourne l'ordonnee du point recepteur du message
		 * @return y 	l'ordonnee
		 */
		return y;
	}
	public void affiche()
	{
		/**
		 * Affiche le point sous la forme (x,y)
		 */
		System.out.print("(" + x + "," + y + ")");
	}
	public boolean equals(Object a)
	{
		/**
		 * Redefinition de equals
		 * @param a	un Object qui doit etre un Point
		 * @return true|false 	test si a est un point && si les coordonnees sont egales
		 */
		if(! (a instanceof Point))
		{
			return false;
		}
		Point p=(Point) a;
		return (x==p.absc()) && (y==p.ordo());
	}
	public double distance(Point a)
	{
		/**
		 * Calcul la distance entre deux points
		 * @param 	a un Point
		 * @return 	distance la distance entre this et a
		 */
		return Math.sqrt((x-a.absc())*(x-a.absc())+(y-a.ordo())*(y-a.ordo()));
	}
	
}//fin class