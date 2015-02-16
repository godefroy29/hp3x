/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:20:18 CET 2015
*
*/
public abstract class ObjetGeometrique2D implements Zoomable{
	public abstract double perimetre();
	public abstract double surface();
	
	public void agrandir(double facteur) throws IllegalZoomFactorException
	{
		if(facteur <= 0)
		{
			throw new IllegalZoomFactorException(); 
		}
	}
	public void reduire(double facteur) throws IllegalZoomFactorException
	{
		if(facteur <= 0)
		{
			throw new IllegalZoomFactorException(); 
		}
	}
}