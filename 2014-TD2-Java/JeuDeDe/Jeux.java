/**
* @author GODEFROY POIRIER
* @version 0.1 : Date : Sun Feb 01 17:09:43 CET 2015
*
*/
public class Jeux {
	//variables d'instances
	/*
	 * @see Joueur
	 */
	private Joueur [] joueurs = new Joueur[5];
	private java.util.Random rnd = new java.util.Random();
	private int nombreDeJoueurs;

	//constructeur
	public Jeux (int nombreJoueurs){
		this.nombreDeJoueurs = nombreJoueurs;
		
		/*
		joueurs[1] = new Joueur(1,rnd);
		joueurs[2] = new Joueur(2,rnd);
		joueurs[3] = new Joueur(3,rnd);
		joueurs[4] = new Joueur(4,rnd);

		for (int i =1; i <= nombreJoueurs; i++)
		{
			affecteUneStrategieAleatoire(joueurs[i]);
		}
		*/
		
		//creation du bon nombre de joueurs et leur affecte une strategie aleatoire
		for (int i = 1; i <= nombreJoueurs; i++)
		{
			joueurs[i] = new Joueur(i,rnd,joueurs);
			affecteUneStrategieAleatoire(joueurs[i]);
		}
	}

	//methodes
	public void affecteUneStrategieAleatoire(Joueur joueur)
	{
		/*
		 * affecte une strategie aleatoire au joueur
		 * @param joueur	un tableau de Joueurs
		 * @see Joueur
		 */
		joueur.setStrategie(1 + rnd.nextInt(3));
	}
	
	public void joue()
	{
		/*
		 * deroulement du jeu
		 * @see Joueur
		 */
		int joueurNumero = 0;
		do{
			joueurNumero++;
			if(joueurNumero > nombreDeJoueurs)
			{
				joueurNumero=1;
			}
			if(joueurs[joueurNumero].dureeStrategie() == 0)
			{
				affecteUneStrategieAleatoire(joueurs[joueurNumero]);
			}
			joueurs[joueurNumero].deplace(1 + rnd.nextInt(6));
			System.out.println("Joueur " + joueurNumero + " position: " + joueurs[joueurNumero].position());
		} while (!joueurs[joueurNumero].gagnant());
		System.out.println("\n\tJoueur " + joueurNumero + " gagne le jeu.");
	}

	public static void main(String[] args)
	{
		/*
		 * Ici 4 est le nombre de joueurs
		 */
		Jeux jeux = new Jeux(4);
		jeux.joue();
	}
}