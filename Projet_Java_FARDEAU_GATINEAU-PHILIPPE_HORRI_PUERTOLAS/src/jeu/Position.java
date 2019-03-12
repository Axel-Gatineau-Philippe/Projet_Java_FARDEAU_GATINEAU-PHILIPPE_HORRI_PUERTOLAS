package jeu;

/**
 * Classe Position qui permet de placer les zones, personnages ou encore les objets.
 *
 */
public class Position {
	
	private int x;
	private int y;
	
	/**
	 * Constructeur de Position
	 * @param x
	 * @param y
	 */
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * M�thode qui permet de placer la position sur l'axe X.
	 * @param x
	 */
	public void setX(int x){
		this.x = x;
	}
	
	/**
	 * M�thode qui permet de placer la position sur l'axe Y.
	 * @param y
	 */
	public void setY(int y){
		this.y = y;
	}
	
	/**
	 * M�thode qui permet de r�cuperer la position sur l'axe X.
	 * @return x
	 */
	public int getX() {
		return x;
	}

	
/**
 * M�thode qui permet de placer la position sur l'axe Y.
 * @return y
 */
	public int getY() {
		return y;
	}

	
}
  