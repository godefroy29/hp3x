/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Wed Feb 11 20:37:55 CET 2015
*
*/
public class Test {
	public static void main(String[] args)
	{
		System.out.println("");
		Cercle c1 = new Cercle(5.0);
		System.out.println("c1=cercle de rayon 5.0");
		Rectangle r1 = new Rectangle(2.0, 3.0);
		System.out.println("r1=rectangle de 2.0*3.0");
		Cylindre cl1 = new Cylindre(5.0, 6.0);
		System.out.println("cl1=cylindre de 5.0*6.0");
		Sphere sp1 = new Sphere(3.0);
		System.out.println("sp1=sphere de 3.0");
		CercleSitue cs1 = new CercleSitue(5.0, 2.0, 1.0);
		System.out.println("cs1=cerclesitue de 5.0 a 2.0,1.0");
		RectangleSitue rs1 = new RectangleSitue(5.0, 6.0, 2.0, 1.0);
		System.out.println("rs1=rectanglesitue de 5.0*6.0 a 2.0,1.0");
		double f1=5.1;
		System.out.println("f1=facteur 5.1");
		double f2=-1.1;
		System.out.println("f2=facteur -1.1");
		System.out.println("");
		System.out.println("perimetre c1 => " + c1.perimetre());
		System.out.println("surface c1 => " + c1.surface());
		System.out.println("perimetre r1 => " + r1.perimetre());
		System.out.println("surface r1 => " + r1.surface());
		System.out.println("");
		System.out.println("perimetre cs1 => " + cs1.perimetre());
		System.out.println("surface cs1 => " + cs1.surface());
		System.out.println("perimetre rs1 => " + rs1.perimetre());
		System.out.println("surface rs1 => " + rs1.surface());
		System.out.println("");
		System.out.println("volume cl1 => " + cl1.volume());
		System.out.println("surface cl1 => " + cl1.surface());
		System.out.println("volume sp1 => " + sp1.volume());
		System.out.println("surface sp1 => " + sp1.surface());
		System.out.println("");
		try
		{
			r1.agrandir(f1);
			r1.reduire(f1);
			r1.reduire(f2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}