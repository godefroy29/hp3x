/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Sun Feb 01 17:33:41 CET 2015
*
*/
public class Joueur {
	//variables d'instances
	private Joueur [] joueurs;
	private int num;
	private Strategie strategie;
	private int duree;
	private int pos;
	public int classement;
	private java.util.Random rnd;

	//constructeur
	public Joueur(int numeroJoueur, java.util.Random rand, Joueur [] joueurTab)
	{
		/*
		 * @param numeroJoueur	numero du joueur que l'ont cree
		 * @param rand			fonction random
		 * @param joueurTab		tableau de joueurs
		 * @see java.util.Random
		 */
		joueurs = joueurTab;
		num = numeroJoueur;
		rnd = rand;
		pos = 0;
		classement = 0;
		switch (1 + rnd.nextInt(3))//selon l'entier retourne on affecte une strategie pour une duree aleatoire
		{
		case 1 :
			strategie = new StrategieTypeUne();
			duree = (2 + rnd.nextInt(4));
			break;
		
		case 2 :
			strategie = new StrategieTypeDeux();
			duree = (2 + rnd.nextInt(4));
			break;
		
		case 3 :
			strategie = new StrategieTypeTrois();
			duree = (2 + rnd.nextInt(4));
			break;
		
		default: 
			System.out.println ("Erreur du random, aucune strategie affectee au joueur" + num);
		}
	}
	
	//methodes
	public int dureeStrategie()
	{
		/*
		 * @return duree	duree restante pour la strategie actuelle
		 */
		 return duree;
	}
	
	public int position()
	{
		/*
		 * @return pos	position actuelle du joueur
		 */
		 return pos;
	}

	public int numero()
	{
		/*
		 * @return num	numero du joueur
		 */
		return num;
	}

	public void deplace(int valDe)
	{
		/*
		 * deplace le joueur d'une certaine distance
		 * la calcul via strategie.score(int valDe)
		 * et decremente la duree de la strategie
		 * @see strategie
		 * @param valDe	distance que le joueur parcours ce tour ci
		 */
		 pos = pos + strategie.score(valDe, joueurs, this);
		 duree = duree - 1;
	}

	public boolean gagnant()
	{
		/*
		 * @return vrai	si sa position est > 499, faux sinon
		 */
		if (pos >= 500)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void setStrategie(int i)
	{
		/*
		 * change de strategie au joueur appelant
		 * @param i	la valeur correspondant a la strategie
		 */
		switch (i)
		{
		case 1 :
			strategie = new StrategieTypeUne();
			duree = (2 + rnd.nextInt(4));
			break;
		
		case 2 :
			strategie = new StrategieTypeDeux();
			duree = (2 + rnd.nextInt(4));
			break;
		
		case 3 :
			strategie = new StrategieTypeTrois();
			duree = (2 + rnd.nextInt(4));
			break;
		
		default: 
			System.out.println ("Erreur du random, aucune strategie affectee au joueur" + num);
		}
		System.out.println("Nouvelle strategie " + this.strategie.getClass().getName() + " pour le joueur numero " + num + " durant " + duree + " tour(s)");
	}

}