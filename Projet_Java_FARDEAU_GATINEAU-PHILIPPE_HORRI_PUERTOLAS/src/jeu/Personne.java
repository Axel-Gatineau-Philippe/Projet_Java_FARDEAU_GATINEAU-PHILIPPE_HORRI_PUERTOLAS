package jeu;

/**
 * Classe Personne, super classe de Personnage et Joueur. Elle contient les m�thodes g�n�rales relatives au personnages du jeu et au joueur.
 *
 */
public class Personne {
	private String nom;
	protected Position position;
	private Carte map;
	
	/**
	 * Constructeur de Personne
	 * @param n
	 * @param p
	 * @param map
	 */
	public Personne(String n, Position p, Carte map)
	{
		super();
		nom = n; 
		position = p;
		this.map = map;
	}

	/**
	 * M�thode qui permet d'attribuer une carte � une personne.
	 * @param map
	 */
	public void setCarte(Carte map) {
		this.map = map;
	}

	/**
	 * M�thode qui permet de r�cup�rer le nom de la personne.
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * M�thode qui permet de r�cuperer la carte sur laquelle est pr�sente la personne.
	 * @return map
	 */
	public Carte getCarte() {
		return map;
	}

	/**
	 * M�thode qui permet de r�cuperer la position d'une personne.
	 * @return position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * M�thode qui permet de positionner une personne.
	 * @param position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	
}  