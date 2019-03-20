package jeu;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Classe Bonus qui contient toutes les m�thodes concernant les bonus. Les bonus donnent des points en plus � la fin du jeu. 
 * @author all
 *
 */
public class Bonus extends Objet{
	private int nombreCookieBonus;
	private Zone zone;
	private Carte carte;

	/**
	 * Constructeur de la classe Bonus
	 * @param n
	 * @param i
	 * @param b
	 * @param p
	 * @param nb
	 * @param z
	 * @param carte
	 */
	public Bonus(String n, ImageView i, boolean b, Position p, int nb, Zone z, Carte carte) {
		super(n, i, b, p);
		nombreCookieBonus = nb;
		this.carte = carte;
		this.zone = z;
	}
	
	/**
	 * M�thode qui permet de r�cup�rer la carte courante
	 * @return
	 */
	public Carte getCarte() {
		return this.carte;
	}

	/**
	 * M�thode qui permet de r�cup�rer la carte zone courante
	 * @return zone
	 */
	public Zone getZone() {
		return zone;
	}

	/**
	 * M�thode qui permet de mettre la zone du bonus � "this"
	 * @param zone
	 */
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	/**
	 * M�thode qui permet de r�cuperer le nombre de cookies bonus
	 * @return nombreCookieBonus
	 */
	public int getNbCookies() {
		return nombreCookieBonus;
	}
	
	
}
   