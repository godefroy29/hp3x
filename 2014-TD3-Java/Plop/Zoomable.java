/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:33:56 CET 2015
*
*/
public interface Zoomable {

	public void agrandir(double facteur)throws IllegalZoomFactorException;
	public void reduire(double facteur)throws IllegalZoomFactorException;
}