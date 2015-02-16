/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:40:15 CET 2015
*
*/
public class Sphere extends ObjetGeometrique3D{
	private double r;

	public Sphere(double a)
	{
		r=a;
	}

	public double surface()
	{
		return 4*3.14*r*r;
	}
	public double volume()
	{
		return (4*3.14*r*r*r)/3.0;
	}
	public void agrandir(double facteur)throws IllegalZoomFactorException
	{
		if(facteur <= 0)
		{
			throw new IllegalZoomFactorException(); 
		}
		r=r*facteur;
	}
	public void reduire(double facteur)throws IllegalZoomFactorException
	{
		if(facteur <= 0)
		{
			throw new IllegalZoomFactorException(); 
		}
		r=r/facteur;
	}
}