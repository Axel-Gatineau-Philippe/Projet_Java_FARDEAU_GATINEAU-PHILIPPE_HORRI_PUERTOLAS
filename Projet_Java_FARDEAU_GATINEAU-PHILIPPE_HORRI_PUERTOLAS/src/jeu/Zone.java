package jeu;

/**
 * Classe Zone permettant de d�finir les zones sur lesquelles sont plac�s les objets, personnes, ou encore les chemins vers les autres cartes.
 *
 */
public class Zone {


	private Position p1;
	private Position p2;
	private Deplacement d;
	private Carte carte;
	
	/**
	 * Constructeur de Zone.
	 * @param p1
	 * @param p2
	 * @param d
	 * @param carte
	 */
	public Zone( Position p1, Position p2, Deplacement d, Carte carte) {
		super();
		this.p2 = p2;
		this.p1 = p1;
		this.d = d;
		this.carte = carte;
	}

	/**
	 * Constructeur de Zone sans d�placement ni carte.
	 * @param p1
	 * @param p2
	 */
	public Zone( Position p1, Position p2) {
		super();
		this.p2 = p2;
		this.p1 = p1;	
	}

	/**
	 * M�thode qui permet de r�cuperer la position 1 de la zone (expliquer en d�tail).
	 * @return p1
	 */
	public Position getP1() {
		return p1;
	}

	/**
	 * M�thode qui permet de d�finir la position 1 de la zone (expliquer en d�tail).
	 * @param p1
	 */
	public void setP1(Position p1) {
		this.p1 = p1;
	}

	/**
	 * M�thode qui permet de r�cuperer la position 2 de la zone (expliquer en d�tail).
	 * @return p2
	 */
	public Position getP2() {
		return p2;
	}

	/**
	 * M�thode qui permet de d�finir la position 1 de la zone (expliquer en d�tail).
	 * @param p2
	 */
	public void setP2(Position p2) {
		this.p2 = p2;
	}
	
	/**
	 * M�thode qui permet de r�cuperer la carte sur laquelle se trouve la zone.
	 * @return carte
	 */
	public Carte getCarte() {
		return carte;
	}

	/**
	 * M�thode qui permet de r�cuperer le sens de d�placement de la zone.
	 * @return d
	 */
	public Deplacement getDeplacement() {
		return d;
	}

	/**
	 * M�thode qui permet de d�finir le sens de d�placement de la zone.
	 * @param d
	 */
	public void setDeplacement(Deplacement d) {
		this.d = d;
	}
	
	
	
}
