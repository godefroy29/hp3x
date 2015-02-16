/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Mon Jan 19 10:10:18 CET 2015
*
*/
public class Droite {
//variable d'instance
	private double x;
	private double y;
//constructeur
	public Droite(double a, double b)
	{	
		/**
		 * Creation de la droite via des coefficients reels
		 * @param a un double representant a dans y=ax+b
		 * @param b un double representant b dans y=ax+b
		 */
	 	this.x=a;
		this.y=b;
	}
	public Droite(Point a, Point b)
	{
		/**		
		 * Creation de la droite via des points
		 * @see Point	classe Point
		 * @param a	un point present sur la droite
		 * @param b	un point present sur la droite
		 */
		this.x=(b.ordo()-a.ordo())/(b.absc()-a.absc());
		this.y=b.ordo()-this.x*b.absc();
	}
//methodes
	public double getA()
	{
		/**
		 * Retourne le coefficient de la droite
		 * @return a 	dans y=ax+b
		 */
		return x;
	}
	public double getB()
	{
		/**
		 * @return b 	dans y=ax+b
		 */
		return y;
	}
	public void affiche()
	{
		/**
		 * Affichage de la droite sous la forme y=ax+b
		 */
		System.out.print("y="+x+"x+"+y);
	}
	public boolean estSurDroite(Point p)
	{
		/**
		 * Test si le point est sur la droite
		 * @see Point	classe Point
		 * @return true|false si le Point appartient à la Droite
		 */
		return (x*p.absc()+y)-p.ordo()==0;
	}
	public boolean estParallele(Droite d)
	{
		/**
		 * Verifie qu'une droite est parallele a une autre
		 * @return true|false si le coefficient est le meme
		 */
		return x==d.getA();
	}
	public Point intersection(Droite d)
	{
		/**
		 * Calcule le point d'intersection de deux droite
		 * @see Point	classe Point
		 * @return point
		 */
		return new Point((d.getB()-y)/(x-d.getA()),(d.getB()-y)/(x-d.getA())*x);
	}
}