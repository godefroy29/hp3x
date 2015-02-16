/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:31:39 CET 2015
*
*/
public class Rectangle extends ObjetGeometrique2D{

	private double la;
	private double lo;

	public Rectangle(double a, double b)
	{
		la=a;
		lo=b;
	}

	public double perimetre()
	{
		return la*2+lo*2;
	}
	public double surface()
	{
		return la*lo;
	}
	public void agrandir(double facteur) throws IllegalZoomFactorException
	{
		super.agrandir(facteur);
		la=la*facteur;
		lo=lo*facteur;
	}
	public void reduire(double facteur) throws IllegalZoomFactorException
	{
		super.reduire(facteur);
		la=la/facteur;
		lo=lo/facteur;
	}
}