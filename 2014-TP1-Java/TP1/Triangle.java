/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Jan 19 09:32:46 CET 2015
*
*/
import java.lang.Math;
//no need import Point.java car meme package
public class Triangle {
//variable d'instance
	private Point a;
	private Point b;
	private Point c;
//constructeur
	public Triangle(Point a, Point b, Point c)
	{
		/**
		 * Creation d'un triangle via 3 Point
		 * @param a	un Point du triangle
		 * @param b	un Point du triangle
		 * @param c	un Point du triangle
		 */
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Triangle(Droite a, Droite b, Droite c)
	{
		/**
		 * Creation d'un triangle via 3 Droite
		 * @param a	une Droite
		 * @param b	une Droite
		 * @param c	une Droite
		 */
		this.a=a.intersection(b);
		this.b=b.intersection(c);
		this.c=c.intersection(a);
	}
//methodes
	public void affiche()
	{
		/**
		 * Affiche le triangle sous la forme ((xa,ya)(xb,yb)(xc,yc))
		 */
		System.out.print("(");
		a.affiche();b.affiche();c.affiche();
		System.out.print(")");
	}
	public double perimetre()
	{
		/**
		 * Calcul le perimetre du triangle
		 * @return distance	distance a,b + distance b,c + distance c,a
		 */
		return a.distance(b)+b.distance(c)+c.distance(a);
	}
	public double aire()
	{
		/**
		 * Calcul l'aire du triangle
		 * @return distance sqrt(p*(p-a)*(p-b)*(p-c))
		 */
		return Math.sqrt(this.perimetre()*(this.perimetre()-a.distance(b))*(this.perimetre()-b.distance(c))*(this.perimetre()-c.distance(a)));
	}
}