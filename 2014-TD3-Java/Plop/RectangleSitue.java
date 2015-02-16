/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 21:22:54 CET 2015
*
*/
public class RectangleSitue extends ObjetGeometrique2DSitue {
	private double la;
	private double lo;
	
	public RectangleSitue(double a, double b, double y, double x)
	{
		la=a;
		lo=b;
		this.y=y;
		this.x=x;
	}

	public double perimetre()
	{
		return la*2+lo*2;
	}
	public double surface()
	{
		return la*lo;
	}
	public void agrandir(double facteur)throws IllegalZoomFactorException
	{
		super.agrandir(facteur);
		la=la*facteur;
		lo=lo*facteur;
	}
	public void reduire(double facteur)throws IllegalZoomFactorException
	{
		super.reduire(facteur);
		la=la/facteur;
		lo=lo/facteur;
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