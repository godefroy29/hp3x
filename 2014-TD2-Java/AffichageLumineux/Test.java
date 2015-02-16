/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Tue Feb 03 18:01:34 CET 2015
*
*/
public class Test {
	public static void main(String[] args)
	{
		char temp;
		Afficheur aff1 = new Afficheur(6);
		char[] message = {'D','e','s','p','r','e','s'};
		aff1.setMessage(message);
		for(int i = 0; i < 15; i++)
		{
			temp = aff1.top();
			System.out.println("<<" + aff1 + ">>");
		}
		System.out.println("affichage latence");
		Latence lat1 = new Latence(6,2);
		lat1.setMessage(message);
		System.out.println();
		System.out.println("<<" + lat1 + ">>");
		
		for(int i = 0; i < 15; i++)
		{
			temp = lat1.top();
			System.out.println("<<" + lat1 + ">>");
		}
		System.out.println("affichage vitesse");
		Vitesse vit1 = new Vitesse(6,2,2);
		vit1.setMessage(message);
		System.out.println();
		System.out.println("<<" + vit1 + ">>");
		for(int i = 0; i < 15; i++)
		{
			temp = vit1.top();
			System.out.println("<<" + vit1 + ">>");
		}
	}
}