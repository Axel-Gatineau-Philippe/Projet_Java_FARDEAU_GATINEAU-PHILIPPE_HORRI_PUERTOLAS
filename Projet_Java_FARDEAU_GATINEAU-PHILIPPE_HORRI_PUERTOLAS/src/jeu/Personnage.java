package jeu;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Classe Personnage qui h�rite de personne. Il s'agit de tous les personnages pr�sents dans le jeu.
 *
 */
public class Personnage extends Personne {
	
	private Enigme enigme;
	private Ingredient ingredient;
	private ImageView image;
	private Zone zone;
	
	/**
	 * Premier constructeur de Personnage.
	 * @param e
	 * @param n
	 * @param p
	 * @param i
	 * @param in
	 * @param map
	 * @param zone
	 */
	public Personnage (Enigme e, String n, Position p, ImageView i, Ingredient in, Carte map, Zone zone) {
		super(n, p, map); 
		image = i;
		enigme = e; 
		ingredient = in;
		this.zone = zone;
		this.setPositionImage(p);
	}
	
	/**
	 * Second constructeur de Personnage (sans activit�).
	 * @param n
	 * @param p
	 * @param i
	 * @param in
	 * @param map
	 * @param zone
	 */
	public Personnage (String n, Position p, ImageView i, Ingredient in, Carte map, Zone zone) {
		super(n, p, map); 
		image = i;
		ingredient = in;
		this.zone = zone;
		this.setPositionImage(p);
	}
	
	/**
	 * Troisi�me constructeur de Personnage (Sans activit� ni ingr�dients).
	 * @param n
	 * @param p
	 * @param i
	 * @param map
	 * @param zone
	 */
	public Personnage (String n, Position p, ImageView i, Carte map, Zone zone) {
		super(n, p, map); 
		image = i;
		this.zone = zone;
		this.setPositionImage(p);
	}
	
	/**
	 * M�thode permettant de r�cuperer l'image du personnage.
	 * @return image
	 */
	public ImageView getImage(){
		return this.image;
	}
	  
	/**
	 * M�thode permettant de placer le personnage.
	 * @param p
	 */
	public void setPositionImage(Position p) {
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}
	
	/**
	 * M�thode permettant de r�cuperer la zone du personage.
	 * @return zone
	 */
	public Zone getZone() {
		return this.zone;
	}
	
	/**
	 * M�thode permettant de r�cuperer l'�nigme du personnage s'il en a une. 
	 * @return
	 */
	public Enigme getEnigme() {
		return this.enigme;
	}
	
}
