/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:22:20 CET 2015
*
*/
public class Cercle extends ObjetGeometrique2D{
	private double r;

	public Cercle(double rayon)
	{
		r = rayon;
	}
	public double perimetre()
	{
		return 3.14*r;
	}
	public double surface()
	{
		return 3.14*r*r;
	}
	public void agrandir(double facteur) throws IllegalZoomFactorException
	{
		super.agrandir(facteur);
		r=r*facteur;
	}
	public void reduire(double facteur) throws IllegalZoomFactorException
	{
		super.reduire(facteur);
		r=r/facteur;
	}
}