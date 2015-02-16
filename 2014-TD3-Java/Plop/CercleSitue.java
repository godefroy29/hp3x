/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:48:34 CET 2015
*
*/
public class CercleSitue extends ObjetGeometrique2DSitue{
	private double r;

	public CercleSitue(double r, double x, double y)
	{
		this.r=r;
		this.x=x;
		this.y=y;
	}

	public double perimetre()
	{
		return 3.14*r;
	}
	public double surface()
	{
		return 3.14*r*r;
	}
	public void agrandir(double facteur)throws IllegalZoomFactorException
	{
		super.agrandir(facteur);
		r=r*facteur;
	}
	public void reduire(double facteur)throws IllegalZoomFactorException
	{
		super.reduire(facteur);
		r=r/facteur;
	}
	public void deplacerHorizontalement(double dep)
	{
		y=y+dep;
	}
	public void deplacerVerticalement(double dep)
	{
		x=x+dep;
	}
}