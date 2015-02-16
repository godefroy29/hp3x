/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:40:11 CET 2015
*
*/
public class Cylindre extends ObjetGeometrique3D{
	private double r;
	private double h;

	public Cylindre(double a, double b)
	{
		r=a;
		h=b;
	}

	public double surface()
	{
		return 2*3.14*r*h;
	}
	public double volume()
	{
		return 3.14*r*r*h;
	}
	public void agrandir(double facteur)throws IllegalZoomFactorException
	{
		if(facteur <= 0)
		{
			throw new IllegalZoomFactorException(); 
		}
		r=r*facteur;
		h=h*facteur;
	}
	public void reduire(double facteur)throws IllegalZoomFactorException
	{
		if(facteur <= 0)
		{
			throw new IllegalZoomFactorException(); 
		}
		r=r/facteur;
		h=h/facteur;
	}
}